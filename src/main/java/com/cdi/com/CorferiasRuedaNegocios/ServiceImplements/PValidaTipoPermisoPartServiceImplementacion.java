package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.LogConsolaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PValidaTipoPermisoPartService;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PValidaTipoPermisoPartServiceImplementacion implements PValidaTipoPermisoPartService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public String ConsultaPValidaTipoPermisoPart(Integer IdParticipante, Integer IdContacto, Integer IdRueda, Integer IdAccion) {
        try {
            StoredProcedureQuery permiso = repositorio.createNamedStoredProcedureQuery("paPValidaTipoPermisoPart");
            permiso.registerStoredProcedureParameter("IdParticipante", Integer.class, ParameterMode.IN);
            permiso.registerStoredProcedureParameter("IdContacto", Integer.class, ParameterMode.IN);
            permiso.registerStoredProcedureParameter("IdRueda", Integer.class, ParameterMode.IN);
            permiso.registerStoredProcedureParameter("IdAccion", Integer.class, ParameterMode.IN);

            permiso.setParameter("IdParticipante", IdParticipante);
            permiso.setParameter("IdContacto", IdContacto);
            permiso.setParameter("IdRueda", IdRueda);
            permiso.setParameter("IdAccion", IdAccion);

            permiso.execute();
            return JSONObject.quote((String) permiso.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paPValidaTipoPermisoPart");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }
}
