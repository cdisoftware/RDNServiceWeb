package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CNovedadModEntity;
import com.cdi.com.Agroapoya2CDI.Services.CNovedadModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;
@Service
public class CNovedadModServiceImplementacion implements CNovedadModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ModCNovedad(CNovedadModEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery modNov = repositorio.createNamedStoredProcedureQuery("paC_NovedadMod");
            modNov.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            modNov.registerStoredProcedureParameter("IdNov", Integer.class, ParameterMode.IN);
            modNov.registerStoredProcedureParameter("IdSubNov", Integer.class, ParameterMode.IN);
            modNov.registerStoredProcedureParameter("Usucodig", Integer.class, ParameterMode.IN);
            modNov.registerStoredProcedureParameter("TipoUsu", Integer.class, ParameterMode.IN);
            modNov.registerStoredProcedureParameter("Observacion", String.class, ParameterMode.IN);
            modNov.registerStoredProcedureParameter("Coordenadas", String.class, ParameterMode.IN);
            modNov.registerStoredProcedureParameter("TiempoRetraso", String.class, ParameterMode.IN);
            modNov.registerStoredProcedureParameter("Timepo", Integer.class, ParameterMode.IN);
            modNov.registerStoredProcedureParameter("HorMin", String.class, ParameterMode.IN);
            modNov.registerStoredProcedureParameter("cd_cnctvo", Integer.class, ParameterMode.IN);
            modNov.registerStoredProcedureParameter("idConductor", Integer.class, ParameterMode.IN);
            modNov.registerStoredProcedureParameter("idSector", Integer.class, ParameterMode.IN);
            modNov.setParameter("Bandera", Bandera);
            modNov.setParameter("IdNov", entidad.getIdNov());
            modNov.setParameter("IdSubNov", entidad.getIdSubNov());
            modNov.setParameter("Usucodig", entidad.getUsucodig());
            modNov.setParameter("TipoUsu", entidad.getTipoUsu());
            modNov.setParameter("Observacion", entidad.getObservacion());
            modNov.setParameter("Coordenadas", entidad.getCoordenadas());
            modNov.setParameter("TiempoRetraso", entidad.getTiempoRetraso());
            modNov.setParameter("Timepo", entidad.getTimepo());
            modNov.setParameter("HorMin", entidad.getHorMin());
            modNov.setParameter("cd_cnctvo", entidad.getCd_cnctvo());
            modNov.setParameter("idConductor", entidad.getIdConductor());
            modNov.setParameter("idSector", entidad.getIdSector());
            modNov.execute();
            return JSONObject.quote((String) modNov.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }
}
