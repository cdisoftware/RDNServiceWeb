package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.TokenTransModEntity;
import com.cdi.com.Agroapoya2CDI.Services.TokenTransModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class TokenTransModServiceImplementacion implements TokenTransModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ActualizaTokenTransMod(TokenTransModEntity entidad, Integer bandera) {
        try {
            StoredProcedureQuery act = repositorio.createNamedStoredProcedureQuery("paC_TokenTransMod");
            act.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            act.registerStoredProcedureParameter("usucodig", Integer.class, ParameterMode.IN);
            act.registerStoredProcedureParameter("TipoUsu", Integer.class, ParameterMode.IN);
            act.registerStoredProcedureParameter("Token", String.class, ParameterMode.IN);

            act.setParameter("bandera", bandera);
            act.setParameter("usucodig", entidad.getUsucodig());
            act.setParameter("TipoUsu", entidad.getTipoUsu());
            act.setParameter("Token", entidad.getToken());

            act.execute();
            return JSONObject.quote((String) act.getOutputParameterValue("respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }

}
