package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.EnvioSMSNuevaEntregaEntity;
import com.cdi.com.Agroapoya2CDI.Services.EnvioSMSNuevaEntregaService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class EnvioSMSNuevaEntregaServiceImplementacion implements EnvioSMSNuevaEntregaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String InsertEnvioSmsNuevaEntrega(EnvioSMSNuevaEntregaEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery smsNew = repositorio.createNamedStoredProcedureQuery("paC_EnvioSMSNuevaEntrega");
            smsNew.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            smsNew.registerStoredProcedureParameter("id_cliete", Integer.class, ParameterMode.IN);
            smsNew.registerStoredProcedureParameter("Timepo", Integer.class, ParameterMode.IN);
            smsNew.registerStoredProcedureParameter("HorMin", String.class, ParameterMode.IN);

            smsNew.setParameter("Bandera", Bandera);
            smsNew.setParameter("id_cliete", entidad.getId_cliete());
            smsNew.setParameter("Timepo", entidad.getTimepo());
            smsNew.setParameter("HorMin", entidad.getHorMin());

            smsNew.execute();
            return JSONObject.quote((String) smsNew.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }
}
