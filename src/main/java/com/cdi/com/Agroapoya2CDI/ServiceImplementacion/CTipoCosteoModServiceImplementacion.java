package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CTipoCosteoModEntity;
import com.cdi.com.Agroapoya2CDI.Services.CTipoCosteoModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CTipoCosteoModServiceImplementacion implements CTipoCosteoModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ModCTipoCoste(CTipoCosteoModEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery modCon = repositorio.createNamedStoredProcedureQuery("paC_TipoCosteoMod");
            modCon.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            modCon.registerStoredProcedureParameter("Descripcion", String.class, ParameterMode.IN);
            modCon.registerStoredProcedureParameter("IdTipoCosteo", Integer.class, ParameterMode.IN);
            modCon.setParameter("Bandera", Bandera);
            modCon.setParameter("Descripcion", entidad.getDescripcion());
            modCon.setParameter("IdTipoCosteo", entidad.getIdTipoCosteo());
            modCon.execute();
            return JSONObject.quote((String) modCon.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }

}
