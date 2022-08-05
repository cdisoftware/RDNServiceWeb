package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.listaCondicionEntity;
import com.cdi.com.Agroapoya2CDI.Services.listaCondicionService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class listaCondicionServiceImplementacion implements listaCondicionService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<listaCondicionEntity> ConsultaListaCondicion(Integer producto) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("paT_listaCondicion");
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
