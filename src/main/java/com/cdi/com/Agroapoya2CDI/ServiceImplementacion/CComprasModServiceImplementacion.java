package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CComprasModEntity;
import com.cdi.com.Agroapoya2CDI.Services.CComprasModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CComprasModServiceImplementacion implements CComprasModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ModCCompras(CComprasModEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery mod = repositorio.createNamedStoredProcedureQuery("paC_ComprasMod");
            mod.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            mod.registerStoredProcedureParameter("Cd_cnsctivo", Integer.class, ParameterMode.IN);
            mod.registerStoredProcedureParameter("Unidades", Integer.class, ParameterMode.IN);
            mod.registerStoredProcedureParameter("Observaciones", String.class, ParameterMode.IN);
            mod.registerStoredProcedureParameter("Usucodig", Integer.class, ParameterMode.IN);
            mod.registerStoredProcedureParameter("CodGrupo", String.class, ParameterMode.IN);
            mod.registerStoredProcedureParameter("TipoComra", Integer.class, ParameterMode.IN);
            mod.registerStoredProcedureParameter("TipoUsuarioCompra", Integer.class, ParameterMode.IN);
            mod.registerStoredProcedureParameter("IdSector", Integer.class, ParameterMode.IN);
            mod.registerStoredProcedureParameter("idCliente", Integer.class, ParameterMode.IN);
            mod.registerStoredProcedureParameter("Toppings", String.class, ParameterMode.IN);

            mod.setParameter("Bandera", Bandera);
            mod.setParameter("Cd_cnsctivo", entidad.getCd_cnsctivo());
            mod.setParameter("Unidades", entidad.getUnidades());
            mod.setParameter("Observaciones", entidad.getObservaciones());
            mod.setParameter("Usucodig", entidad.getUsucodig());
            mod.setParameter("CodGrupo", entidad.getCodGrupo());
            mod.setParameter("TipoComra", entidad.getTipoComra());
            mod.setParameter("TipoUsuarioCompra", entidad.getTipoUsuarioCompra());
            mod.setParameter("IdSector", entidad.getIdSector());
            mod.setParameter("idCliente", entidad.getIdCliente());
            mod.setParameter("Toppings", entidad.getToppings());

            mod.execute();
            return JSONObject.quote((String) mod.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }
}
