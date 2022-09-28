package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CCalificaAppEntity;
import com.cdi.com.Agroapoya2CDI.Services.CCalificaAppService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CCalificaAppServiceImplementacion implements CCalificaAppService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ConsultaCalificaApp(CCalificaAppEntity entidad) {
        try {
            StoredProcedureQuery respu = repositorio.createNamedStoredProcedureQuery("paC_CalificaApp");
            respu.registerStoredProcedureParameter("usucodig", Integer.class, ParameterMode.IN);
            respu.registerStoredProcedureParameter("tipoUsuario", Integer.class, ParameterMode.IN);
            respu.registerStoredProcedureParameter("subTipoUsuario", Integer.class, ParameterMode.IN);
            respu.registerStoredProcedureParameter("Calificacion", String.class, ParameterMode.IN);
            respu.registerStoredProcedureParameter("Observacion", String.class, ParameterMode.IN);

            respu.setParameter("usucodig", entidad.getUsucodig());
            respu.setParameter("tipoUsuario", entidad.getTipoUsuario());
            respu.setParameter("subTipoUsuario", entidad.getSubTipoUsuario());
            respu.setParameter("Calificacion", entidad.getCalificacion());
            respu.setParameter("Observacion", entidad.getObservacion());

            respu.execute();
            return JSONObject.quote((String) respu.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }
}
