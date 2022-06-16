package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.mv_pa_INSERT_PROCESO_PAGOEntity;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;
import com.cdi.com.Agroapoya2CDI.Services.mv_pa_INSERT_PROCESO_PAGOService;

@Service
public class mv_pa_INSERT_PROCESO_PAGOServiceImplementacion implements mv_pa_INSERT_PROCESO_PAGOService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String InsertProcesPago(mv_pa_INSERT_PROCESO_PAGOEntity entidad) {
        try {
            StoredProcedureQuery insertpago = repositorio.createNamedStoredProcedureQuery("mv_pa_INSERT_PROCESO_PAGO");
            insertpago.registerStoredProcedureParameter("CD_CNSCTVO", Integer.class, ParameterMode.IN);
            insertpago.registerStoredProcedureParameter("COD_PEDIDO", String.class, ParameterMode.IN);
            insertpago.registerStoredProcedureParameter("VALOR_PAG", String.class, ParameterMode.IN);
            insertpago.registerStoredProcedureParameter("ID_CLIENTE", Integer.class, ParameterMode.IN);
            insertpago.setParameter("CD_CNSCTVO", entidad.getCD_CNSCTVO());
            insertpago.setParameter("COD_PEDIDO", entidad.getCOD_PEDIDO());
            insertpago.setParameter("VALOR_PAG", entidad.getVLOR_PGAR());
            insertpago.setParameter("ID_CLIENTE", entidad.getID_CLNTE());
            insertpago.execute();
            return JSONObject.quote((String) insertpago.getOutputParameterValue("respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }
}
