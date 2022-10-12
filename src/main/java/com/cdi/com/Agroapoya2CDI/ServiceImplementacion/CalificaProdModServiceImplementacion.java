package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CalificaProdModEntity;
import com.cdi.com.Agroapoya2CDI.Services.CalificaProdModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CalificaProdModServiceImplementacion implements CalificaProdModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ModCalificaProdMod(CalificaProdModEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery modCalif = repositorio.createNamedStoredProcedureQuery("paC_CalificaProdMod");
            modCalif.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            modCalif.registerStoredProcedureParameter("Usucodig", Integer.class, ParameterMode.IN);
            modCalif.registerStoredProcedureParameter("Cd_cnsctvo", Integer.class, ParameterMode.IN);
            modCalif.registerStoredProcedureParameter("IdZona", Integer.class, ParameterMode.IN);
            modCalif.registerStoredProcedureParameter("Calificacion", Integer.class, ParameterMode.IN);
            modCalif.registerStoredProcedureParameter("Comemtario", String.class, ParameterMode.IN);
            modCalif.registerStoredProcedureParameter("WebApp", Integer.class, ParameterMode.IN);

            modCalif.setParameter("Bandera", Bandera);
            modCalif.setParameter("Usucodig", entidad.getUsucodig());
            modCalif.setParameter("Cd_cnsctvo", entidad.getCd_cnsctvo());
            modCalif.setParameter("IdZona", entidad.getIdZona());
            modCalif.setParameter("Calificacion", entidad.getCalificacion());
            modCalif.setParameter("Comemtario", entidad.getComemtario());
            modCalif.setParameter("WebApp", entidad.getWebApp());

            modCalif.execute();
            return JSONObject.quote((String) modCalif.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }

}
