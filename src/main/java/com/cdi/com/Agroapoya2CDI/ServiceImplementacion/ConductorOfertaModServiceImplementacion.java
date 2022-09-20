package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.ConductorOfertaModEntity;
import com.cdi.com.Agroapoya2CDI.Services.ConductorOfertaModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class ConductorOfertaModServiceImplementacion implements ConductorOfertaModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ModConductorOfert(ConductorOfertaModEntity entidad, Integer BANDERA) {
        try {
            StoredProcedureQuery mod = repositorio.createNamedStoredProcedureQuery("paConductorOfertaMod");
            mod.registerStoredProcedureParameter("BANDERA", Integer.class, ParameterMode.IN);
            mod.registerStoredProcedureParameter("CD_CNSCTVO", Integer.class, ParameterMode.IN);
            mod.registerStoredProcedureParameter("ID_SCTOR_OFRTA", Integer.class, ParameterMode.IN);
            mod.registerStoredProcedureParameter("ID_CNDCTOR", Integer.class, ParameterMode.IN);
            mod.registerStoredProcedureParameter("USUCODIG_TRANS", Integer.class, ParameterMode.IN);
            mod.registerStoredProcedureParameter("VLOR_FLTE_PCTDO", String.class, ParameterMode.IN);
            mod.registerStoredProcedureParameter("ESTADO", Integer.class, ParameterMode.IN);

            mod.setParameter("BANDERA", BANDERA);
            mod.setParameter("CD_CNSCTVO", entidad.getCD_CNSCTVO());
            mod.setParameter("ID_SCTOR_OFRTA", entidad.getID_SCTOR_OFRTA());
            mod.setParameter("ID_CNDCTOR", entidad.getID_CNDCTOR());
            mod.setParameter("USUCODIG_TRANS", entidad.getUSUCODIG_TRANS());
            mod.setParameter("VLOR_FLTE_PCTDO", entidad.getVLOR_FLTE_PCTDO());
            mod.setParameter("ESTADO", entidad.getESTADO());
   
            mod.execute();
            return JSONObject.quote((String) mod.getOutputParameterValue("respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }
}
