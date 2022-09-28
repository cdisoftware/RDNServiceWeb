package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CCambiaEstadoOfertaModEntity;
import com.cdi.com.Agroapoya2CDI.Services.CCambiaEstadoOfertaModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CCambiaEstadoOfertaModServiceImplementacion implements CCambiaEstadoOfertaModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ModCCambiaEstadoOferta(CCambiaEstadoOfertaModEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery modestado = repositorio.createNamedStoredProcedureQuery("paCCambiaEstadoOfertaMod");
            modestado.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            modestado.registerStoredProcedureParameter("usucodig", Integer.class, ParameterMode.IN);
            modestado.registerStoredProcedureParameter("cnctivoOferta", Integer.class, ParameterMode.IN);
            modestado.registerStoredProcedureParameter("ObsEstado", String.class, ParameterMode.IN);
            modestado.registerStoredProcedureParameter("estado", Integer.class, ParameterMode.IN);
            modestado.registerStoredProcedureParameter("parametro1", String.class, ParameterMode.IN);
            modestado.registerStoredProcedureParameter("parametro2", String.class, ParameterMode.IN);
            modestado.registerStoredProcedureParameter("parametro3", String.class, ParameterMode.IN);
            modestado.setParameter("Bandera", Bandera);
            modestado.setParameter("usucodig", entidad.getUsucodig());
            modestado.setParameter("cnctivoOferta", entidad.getCnctivoOferta());
            modestado.setParameter("ObsEstado", entidad.getObsEstado());
            modestado.setParameter("estado", entidad.getEstado());
            modestado.setParameter("parametro1", entidad.getParametro1());
            modestado.setParameter("parametro2", entidad.getParametro2());
            modestado.setParameter("parametro3", entidad.getParametro3());
            modestado.execute();
            return JSONObject.quote((String) modestado.getOutputParameterValue("respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }

}
