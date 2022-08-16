package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CSectorOfertaModEntity;
import com.cdi.com.Agroapoya2CDI.Services.CSectorOfertaModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CSectorOfertaModServiceImplementacion implements CSectorOfertaModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String CSectorOfertaMod(CSectorOfertaModEntity entidad, Integer bandera) {
        try {
            StoredProcedureQuery respu = repositorio.createNamedStoredProcedureQuery("paCSectorOfertaMod");
            respu.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            respu.registerStoredProcedureParameter("ID", String.class, ParameterMode.IN);
            respu.registerStoredProcedureParameter("CD_CNSCTVO", String.class, ParameterMode.IN);
            respu.registerStoredProcedureParameter("ID_SCTOR_OFRTA", String.class, ParameterMode.IN);
            respu.registerStoredProcedureParameter("CANTIDAD", String.class, ParameterMode.IN);
            respu.registerStoredProcedureParameter("VALOR_FLETE", String.class, ParameterMode.IN);

            respu.setParameter("bandera", bandera);
            respu.setParameter("ID", entidad.getID());
            respu.setParameter("CD_CNSCTVO", entidad.getCD_CNSCTVO());
            respu.setParameter("ID_SCTOR_OFRTA", entidad.getID_SCTOR_OFRTA());
            respu.setParameter("CANTIDAD", entidad.getCNTDAD());
            respu.setParameter("VALOR_FLETE", entidad.getVLOR_FLTE_SGRDO());

            respu.execute();
            return JSONObject.quote((String) respu.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }

}
