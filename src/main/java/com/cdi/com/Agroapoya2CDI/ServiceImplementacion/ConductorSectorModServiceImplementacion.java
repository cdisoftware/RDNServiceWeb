package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.ConductorSectorModEntity;
import com.cdi.com.Agroapoya2CDI.Services.ConductorSectorModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class ConductorSectorModServiceImplementacion implements ConductorSectorModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ModConductorSector(ConductorSectorModEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery modconduct = repositorio.createNamedStoredProcedureQuery("paC_conductorSectorMod");
            modconduct.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            modconduct.registerStoredProcedureParameter("Cd_cnsctivo", Integer.class, ParameterMode.IN);
            modconduct.registerStoredProcedureParameter("Id_Sector", Integer.class, ParameterMode.IN);
            modconduct.registerStoredProcedureParameter("Id_Conductor", Integer.class, ParameterMode.IN);
            modconduct.registerStoredProcedureParameter("UsucodigTrans", Integer.class, ParameterMode.IN);
            modconduct.registerStoredProcedureParameter("vlor_flete", String.class, ParameterMode.IN);
            modconduct.registerStoredProcedureParameter("IdEstado", Integer.class, ParameterMode.IN);
            modconduct.setParameter("Bandera", Bandera);
            modconduct.setParameter("Cd_cnsctivo", entidad.getCd_cnsctivo());
            modconduct.setParameter("Id_Sector", entidad.getId_Sector());
            modconduct.setParameter("Id_Conductor", entidad.getId_Conductor());
            modconduct.setParameter("UsucodigTrans", entidad.getUsucodigTrans());
            modconduct.setParameter("vlor_flete", entidad.getVlor_flete());
            modconduct.setParameter("IdEstado", entidad.getIdEstado());

            modconduct.execute();
            return JSONObject.quote((String) modconduct.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }

}
