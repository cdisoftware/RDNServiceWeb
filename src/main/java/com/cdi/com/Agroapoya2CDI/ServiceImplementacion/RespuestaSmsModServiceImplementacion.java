package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Services.RespuestaSmsModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class RespuestaSmsModServiceImplementacion implements RespuestaSmsModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ModRespuestaSms(String mensaje, String celular) {
        try {
            StoredProcedureQuery respusms = repositorio.createNamedStoredProcedureQuery("paC_RespuestaSmsMod");

            respusms.registerStoredProcedureParameter("mensaje", String.class, ParameterMode.IN);
            respusms.registerStoredProcedureParameter("celular", String.class, ParameterMode.IN);
            respusms.setParameter("mensaje", mensaje);
            respusms.setParameter("celular", celular);

            respusms.execute();
            return JSONObject.quote((String) respusms.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }

}
