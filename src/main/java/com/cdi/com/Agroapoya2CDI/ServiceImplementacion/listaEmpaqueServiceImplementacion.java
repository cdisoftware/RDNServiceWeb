package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.listaEmpaqueEntity;
import com.cdi.com.Agroapoya2CDI.Services.listaEmpaqueService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class listaEmpaqueServiceImplementacion implements listaEmpaqueService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<listaEmpaqueEntity> ConsultaListaEmpaque(Integer producto) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("sp_listaEmpaque");
            tpoDoc.registerStoredProcedureParameter("producto", Integer.class, ParameterMode.IN);
            tpoDoc.setParameter("producto", producto);
            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
