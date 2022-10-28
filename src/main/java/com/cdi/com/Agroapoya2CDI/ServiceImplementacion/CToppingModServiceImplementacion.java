package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CToppingModEntity;
import com.cdi.com.Agroapoya2CDI.Services.CToppingModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CToppingModServiceImplementacion implements CToppingModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ModCTopping(CToppingModEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery modTopping = repositorio.createNamedStoredProcedureQuery("paC_ToppingMod");
            modTopping.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            modTopping.registerStoredProcedureParameter("IdTopping", Integer.class, ParameterMode.IN);
            modTopping.registerStoredProcedureParameter("Id_Sector", Integer.class, ParameterMode.IN);
            modTopping.registerStoredProcedureParameter("cd_cnctivo", Integer.class, ParameterMode.IN);
            modTopping.registerStoredProcedureParameter("Descricpcion", String.class, ParameterMode.IN);
            modTopping.registerStoredProcedureParameter("MaxCantidad", Integer.class, ParameterMode.IN);
            modTopping.registerStoredProcedureParameter("IdTipoTopping", Integer.class, ParameterMode.IN);
            modTopping.registerStoredProcedureParameter("ValorUnitario", Integer.class, ParameterMode.IN);
            modTopping.registerStoredProcedureParameter("cantidadReserva", Integer.class, ParameterMode.IN);

            modTopping.setParameter("Bandera", Bandera);
            modTopping.setParameter("IdTopping", entidad.getIdTopping());
            modTopping.setParameter("Id_Sector", entidad.getId_Sector());
            modTopping.setParameter("cd_cnctivo", entidad.getCd_cnctivo());
            modTopping.setParameter("Descricpcion", entidad.getDescricpcion());
            modTopping.setParameter("MaxCantidad", entidad.getMaxCantidad());
            modTopping.setParameter("IdTipoTopping", entidad.getIdTipoTopping());
            modTopping.setParameter("ValorUnitario", entidad.getValorUnitario());
            modTopping.setParameter("cantidadReserva", entidad.getCantidadReserva());

            modTopping.execute();
            return JSONObject.quote((String) modTopping.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }
}
