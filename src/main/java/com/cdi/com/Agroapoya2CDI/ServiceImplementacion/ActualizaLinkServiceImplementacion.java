package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.ActualizaLinkEntity;
import com.cdi.com.Agroapoya2CDI.Services.ActualizaLinkService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class ActualizaLinkServiceImplementacion implements ActualizaLinkService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ActualizaLinkS(ActualizaLinkEntity entidad) {
        try {
            StoredProcedureQuery actlink = repositorio.createNamedStoredProcedureQuery("pa_ActualizaLink");
            actlink.registerStoredProcedureParameter("IdGrupo", Integer.class, ParameterMode.IN);
            actlink.registerStoredProcedureParameter("Link", String.class, ParameterMode.IN);
            actlink.setParameter("IdGrupo", entidad.getIdGrupo());
            actlink.setParameter("Link", entidad.getLink());
            actlink.execute();
            return null;
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }

}
