package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CosteoOfertaModEntity;
import com.cdi.com.Agroapoya2CDI.Services.CosteoOfertaModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CosteoOfertaModServiceImplementacion implements CosteoOfertaModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String CosteOFertaMod(CosteoOfertaModEntity entidad, Integer bandera) {
        try {
            StoredProcedureQuery modoferta = repositorio.createNamedStoredProcedureQuery("paCCosteoOfertaMod");
            modoferta.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            modoferta.registerStoredProcedureParameter("CD_CNSCTVO", Integer.class, ParameterMode.IN);
            modoferta.registerStoredProcedureParameter("CD_TIPO_COSTEO", Integer.class, ParameterMode.IN);
            modoferta.registerStoredProcedureParameter("CD_TPO_VLOR", Integer.class, ParameterMode.IN);
            modoferta.registerStoredProcedureParameter("VLOR", String.class, ParameterMode.IN);

            modoferta.setParameter("bandera", bandera);
            modoferta.setParameter("CD_CNSCTVO", entidad.getCD_CNSCTVO());
            modoferta.setParameter("CD_TIPO_COSTEO", entidad.getCD_TIPO_COSTEO());
            modoferta.setParameter("CD_TPO_VLOR", entidad.getCD_TPO_VLOR());
            modoferta.setParameter("VLOR", entidad.getVLOR());

            modoferta.execute();
            return JSONObject.quote((String) modoferta.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }

}
