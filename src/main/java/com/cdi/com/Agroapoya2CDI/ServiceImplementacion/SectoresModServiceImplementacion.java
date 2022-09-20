package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.SectoresModEntity;
import com.cdi.com.Agroapoya2CDI.Services.SectoresModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class SectoresModServiceImplementacion implements SectoresModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String SectoresMod(SectoresModEntity entidad, Integer BANDERA) {
        try {
            StoredProcedureQuery respu = repositorio.createNamedStoredProcedureQuery("paT_SectoresMod");
            respu.registerStoredProcedureParameter("BANDERA", Integer.class, ParameterMode.IN);
            respu.registerStoredProcedureParameter("USUCODIG", Integer.class, ParameterMode.IN);
            respu.registerStoredProcedureParameter("SCTOR_OFR", Integer.class, ParameterMode.IN);
            respu.registerStoredProcedureParameter("DSCRPCION_SCTOR", String.class, ParameterMode.IN);
            respu.registerStoredProcedureParameter("CD_RGION", String.class, ParameterMode.IN);
            respu.registerStoredProcedureParameter("CD_MNCPIO", String.class, ParameterMode.IN);

            respu.setParameter("BANDERA", BANDERA);
            respu.setParameter("USUCODIG", entidad.getUSUCODIG());
            respu.setParameter("SCTOR_OFR", entidad.getSCTOR_OFR());
            respu.setParameter("DSCRPCION_SCTOR", entidad.getDSCRPCION_SCTOR());
            respu.setParameter("CD_RGION", entidad.getCD_RGION());
            respu.setParameter("CD_MNCPIO", entidad.getCD_MNCPIO());
            respu.execute();
            return JSONObject.quote((String) respu.getOutputParameterValue("respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }

}
