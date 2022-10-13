package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.CEstadoTransporteModEntity;
import com.cdi.com.Agroapoya2CDI.Services.CEstadoTransporteModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CEstadoTransporteModServiceImplementacion implements CEstadoTransporteModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ActualizaCEstadoTransporte(CEstadoTransporteModEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery Actestado = repositorio.createNamedStoredProcedureQuery("paC_EstadoTransporteMod");
            Actestado.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            Actestado.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            Actestado.registerStoredProcedureParameter("Cd_cnsctvo", Integer.class, ParameterMode.IN);
            Actestado.registerStoredProcedureParameter("IdSector", Integer.class, ParameterMode.IN);
            Actestado.registerStoredProcedureParameter("IdConctor", Integer.class, ParameterMode.IN);
            Actestado.registerStoredProcedureParameter("Observacion", String.class, ParameterMode.IN);
            Actestado.registerStoredProcedureParameter("Coordenadas", String.class, ParameterMode.IN);

            Actestado.setParameter("Bandera", Bandera);
            Actestado.setParameter("Estado", entidad.getEstado());
            Actestado.setParameter("Cd_cnsctvo", entidad.getCd_cnsctvo());
            Actestado.setParameter("IdSector", entidad.getIdSector());
            Actestado.setParameter("IdConctor", entidad.getIdConctor());
            Actestado.setParameter("Observacion", entidad.getObservacion());
            Actestado.setParameter("Coordenadas", entidad.getCoordenadas());

            Actestado.execute();
            return JSONObject.quote((String) Actestado.getOutputParameterValue("respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }

}
