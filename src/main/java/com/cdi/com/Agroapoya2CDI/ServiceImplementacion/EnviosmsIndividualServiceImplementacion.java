package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Services.EnviosmsIndividualService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class EnviosmsIndividualServiceImplementacion implements EnviosmsIndividualService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String EnvioSmsIndividual(Integer Bandera, Integer Usucodig, Integer cd_cnctivo, Integer idSector, Integer idCliente, String TelefonoP, String Codigo) {
        try {
            StoredProcedureQuery smsindividual = repositorio.createNamedStoredProcedureQuery("pac_EnviosmsIndividual");
            smsindividual.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            smsindividual.registerStoredProcedureParameter("Usucodig", Integer.class, ParameterMode.IN);
            smsindividual.registerStoredProcedureParameter("cd_cnctivo", Integer.class, ParameterMode.IN);
            smsindividual.registerStoredProcedureParameter("idSector", Integer.class, ParameterMode.IN);
            smsindividual.registerStoredProcedureParameter("idCliente", Integer.class, ParameterMode.IN);
            smsindividual.registerStoredProcedureParameter("TelefonoP", String.class, ParameterMode.IN);
            smsindividual.registerStoredProcedureParameter("Codigo", String.class, ParameterMode.IN);

            smsindividual.setParameter("Bandera", Bandera);
            smsindividual.setParameter("Usucodig", Usucodig);
            smsindividual.setParameter("cd_cnctivo", cd_cnctivo);
            smsindividual.setParameter("idSector", idSector);
            smsindividual.setParameter("idCliente", idCliente);
            smsindividual.setParameter("TelefonoP", TelefonoP);
            smsindividual.setParameter("Codigo", Codigo);

            smsindividual.execute();
            return JSONObject.quote((String) smsindividual.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }
}
