package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CtokenPersonaModEntity;
import com.cdi.com.Agroapoya2CDI.Services.CtokenPersonaModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CtokenPersonaModServiceImplementacion implements CtokenPersonaModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ModtokenPersona(CtokenPersonaModEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery modtoken = repositorio.createNamedStoredProcedureQuery("paC_tokenPersonaMod");
            modtoken.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            modtoken.registerStoredProcedureParameter("correoPersona", String.class, ParameterMode.IN);
            modtoken.registerStoredProcedureParameter("TokePrsna", String.class, ParameterMode.IN);

            modtoken.setParameter("Bandera", Bandera);
            modtoken.setParameter("correoPersona", entidad.getCorreoPersona());
            modtoken.setParameter("TokePrsna", entidad.getTokePrsna());

            modtoken.execute();
            return JSONObject.quote((String) modtoken.getOutputParameterValue("respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }

}
