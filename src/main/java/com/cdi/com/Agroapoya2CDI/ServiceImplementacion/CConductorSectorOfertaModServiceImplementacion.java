package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CConductorSectorOfertaModEntity;
import com.cdi.com.Agroapoya2CDI.Services.CConductorSectorOfertaModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CConductorSectorOfertaModServiceImplementacion implements CConductorSectorOfertaModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String CConductorOfertaMod(CConductorSectorOfertaModEntity entidad, Integer bandera) {
        try {
            StoredProcedureQuery mod = repositorio.createNamedStoredProcedureQuery("paCConductorSectorOfertaMod");
            mod.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            mod.registerStoredProcedureParameter("ID", String.class, ParameterMode.IN);
            mod.registerStoredProcedureParameter("CD_CNSCTVO", String.class, ParameterMode.IN);
            mod.registerStoredProcedureParameter("ID_SCTOR_OFRTA", String.class, ParameterMode.IN);
            mod.registerStoredProcedureParameter("ID_CNDCTOR", String.class, ParameterMode.IN);
            mod.registerStoredProcedureParameter("USUCODIG_TRANS", String.class, ParameterMode.IN);
            mod.registerStoredProcedureParameter("VLOR_FLTE_PCTDO", String.class, ParameterMode.IN);
            mod.setParameter("bandera", bandera);
            mod.setParameter("ID", entidad.getID());
            mod.setParameter("CD_CNSCTVO", entidad.getCD_CNSCTVO());
            mod.setParameter("ID_SCTOR_OFRTA", entidad.getID_SCTOR_OFRTA());
            mod.setParameter("ID_CNDCTOR", entidad.getID_CNDCTOR());
            mod.setParameter("USUCODIG_TRANS", entidad.getUSUCODIG_TRANS());
            mod.setParameter("VLOR_FLTE_PCTDO", entidad.getVLOR_FLTE_PCTDO());
            mod.execute();
            return JSONObject.quote((String) mod.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }

}
