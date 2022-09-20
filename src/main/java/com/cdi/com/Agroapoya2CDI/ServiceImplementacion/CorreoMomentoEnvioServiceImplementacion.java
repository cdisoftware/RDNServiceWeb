
package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CorreoMomentoEnvioEntoty;
import com.cdi.com.Agroapoya2CDI.Services.CorreoMomentoEnvioService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CorreoMomentoEnvioServiceImplementacion implements CorreoMomentoEnvioService{
   @PersistenceContext
        private EntityManager repositorio;
    @Override
    public List<CorreoMomentoEnvioEntoty> ConsultaCorreoMomentoEnvio(Integer Bandera) {
       try {
            StoredProcedureQuery correo = repositorio.createNamedStoredProcedureQuery("paC_CorreoMomentoEnvio");
            correo.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            correo.setParameter("Bandera", Bandera);
            return correo.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}