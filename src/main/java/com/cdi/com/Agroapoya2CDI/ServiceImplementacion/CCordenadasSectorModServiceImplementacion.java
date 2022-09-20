package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CCordenadasSectorModEntity;
import com.cdi.com.Agroapoya2CDI.Services.CCordenadasSectorModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CCordenadasSectorModServiceImplementacion implements CCordenadasSectorModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String CordenadasSectorMod(CCordenadasSectorModEntity entidad, Integer BANDERA) {
        try {
            StoredProcedureQuery cordMod = repositorio.createNamedStoredProcedureQuery("paCCordenadasSectorMod");
            cordMod.registerStoredProcedureParameter("BANDERA", Integer.class, ParameterMode.IN);
            cordMod.registerStoredProcedureParameter("ID", Integer.class, ParameterMode.IN);
            cordMod.registerStoredProcedureParameter("ID_SCTOR_OFRTA", Integer.class, ParameterMode.IN);
            cordMod.registerStoredProcedureParameter("LTTUD", String.class, ParameterMode.IN);
            cordMod.registerStoredProcedureParameter("LNGTUD", String.class, ParameterMode.IN);

            cordMod.setParameter("BANDERA", BANDERA);
            cordMod.setParameter("ID", entidad.getID());
            cordMod.setParameter("ID_SCTOR_OFRTA", entidad.getID_SCTOR_OFRTA());
            cordMod.setParameter("LTTUD", entidad.getLTTUD());
            cordMod.setParameter("LNGTUD", entidad.getLNGTUD());

            cordMod.execute();
            return JSONObject.quote((String) cordMod.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }
}
