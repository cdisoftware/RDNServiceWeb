package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.loginTransEntity;
import com.cdi.com.Agroapoya2CDI.Services.loginTransService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class loginTransServiceImplementacion implements loginTransService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<loginTransEntity> ConsultaLoginTransportista(loginTransEntity entidad, Integer bandera) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("paC_loginTrans");
            tpoDoc.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("usucodig", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("correo", String.class, ParameterMode.IN);
            tpoDoc.setParameter("bandera", bandera);
            tpoDoc.setParameter("usucodig", entidad.getUSUCODIG());
            tpoDoc.setParameter("correo", entidad.getCorreoPersona());
            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
