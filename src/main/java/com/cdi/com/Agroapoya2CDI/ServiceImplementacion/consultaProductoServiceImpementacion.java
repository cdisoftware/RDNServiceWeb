package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.consultaProductoEntity;
import com.cdi.com.Agroapoya2CDI.Services.consultaProductoService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class consultaProductoServiceImpementacion implements consultaProductoService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<consultaProductoEntity> ConsultaProducto(Integer cd_consecutivo) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("paC_consultaProducto");
            tpoDoc.registerStoredProcedureParameter("cd_consecutivo", Integer.class, ParameterMode.IN);
            tpoDoc.setParameter("cd_consecutivo", cd_consecutivo);
            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
