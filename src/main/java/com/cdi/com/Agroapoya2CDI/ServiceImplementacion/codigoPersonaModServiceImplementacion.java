package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Services.codigoPersonaModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class codigoPersonaModServiceImplementacion implements codigoPersonaModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ActualizaCodigoPersona(Integer bandera) {
        try {
            StoredProcedureQuery cod = repositorio.createNamedStoredProcedureQuery("paC_codigoPersonaMod");
            cod.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            cod.setParameter("bandera", bandera);
            cod.execute();
            return JSONObject.quote((String) cod.getOutputParameterValue("respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }
}
