package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CGrupoClienteEntity;
import com.cdi.com.Agroapoya2CDI.Services.CGrupoClienteService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CGrupoClienteServiceImplementacion implements CGrupoClienteService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String InsertCGrupCliente(CGrupoClienteEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery insertgrupclient = repositorio.createNamedStoredProcedureQuery("paCGrupoCliente");
            insertgrupclient.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            insertgrupclient.registerStoredProcedureParameter("Cd_Cnsctvo", Integer.class, ParameterMode.IN);
            insertgrupclient.registerStoredProcedureParameter("tpo_vnta", Integer.class, ParameterMode.IN);
            insertgrupclient.registerStoredProcedureParameter("Usucodig", Integer.class, ParameterMode.IN);
            insertgrupclient.registerStoredProcedureParameter("Unidades", Integer.class, ParameterMode.IN);
            insertgrupclient.registerStoredProcedureParameter("IdGrupo", Integer.class, ParameterMode.IN);

            insertgrupclient.setParameter("Bandera", Bandera);
            insertgrupclient.setParameter("Cd_Cnsctvo", entidad.getCD_CNSCTVO());
            insertgrupclient.setParameter("tpo_vnta", entidad.getTPO_VNTA());
            insertgrupclient.setParameter("Usucodig", entidad.getUsuCodig());
            insertgrupclient.setParameter("Unidades", entidad.getUNID_GRUPO());
            insertgrupclient.setParameter("IdGrupo", entidad.getIdGrupo());

            insertgrupclient.execute();
            return JSONObject.quote((String) insertgrupclient.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }

    @Override
    public String EliminaCGrupCliente(CGrupoClienteEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery deletgrupclient = repositorio.createNamedStoredProcedureQuery("paCGrupoCliente");
            deletgrupclient.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            deletgrupclient.registerStoredProcedureParameter("Cd_Cnsctvo", Integer.class, ParameterMode.IN);
            deletgrupclient.registerStoredProcedureParameter("tpo_vnta", Integer.class, ParameterMode.IN);
            deletgrupclient.registerStoredProcedureParameter("Usucodig", Integer.class, ParameterMode.IN);
            deletgrupclient.registerStoredProcedureParameter("Unidades", Integer.class, ParameterMode.IN);
            deletgrupclient.registerStoredProcedureParameter("IdGrupo", Integer.class, ParameterMode.IN);

            deletgrupclient.setParameter("Bandera", Bandera);
            deletgrupclient.setParameter("Cd_Cnsctvo", entidad.getCD_CNSCTVO());
            deletgrupclient.setParameter("tpo_vnta", entidad.getTPO_VNTA());
            deletgrupclient.setParameter("Usucodig", entidad.getUsuCodig());
            deletgrupclient.setParameter("Unidades", entidad.getUNID_GRUPO());
            deletgrupclient.setParameter("IdGrupo", entidad.getIdGrupo());

            deletgrupclient.execute();
            return JSONObject.quote((String) deletgrupclient.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }
}
