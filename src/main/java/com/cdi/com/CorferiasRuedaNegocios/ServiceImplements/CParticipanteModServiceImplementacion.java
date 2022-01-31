package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CParticipanteModEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.CParticipanteModService;
import com.cdi.com.CorferiasRuedaNegocios.Services.LogConsolaService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CParticipanteModServiceImplementacion implements CParticipanteModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public String ActualizarParticipante(CParticipanteModEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("paCParticipanteMod");
            rolconsola.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdParticipante", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdRdn", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TipoPerfil", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("SoloNacional", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("NacionalExp", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TipoCita", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Adicional", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("MinPermitida", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("MaxPermitida", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Observaciones", String.class, ParameterMode.IN);
            rolconsola.setParameter("Bandera", Bandera);
            rolconsola.setParameter("IdParticipante", entidad.getIdParticipante());
            rolconsola.setParameter("IdRdn", entidad.getIdRuedaNegocio());
            rolconsola.setParameter("TipoPerfil", entidad.getIdPerfilRueda());
            rolconsola.setParameter("SoloNacional", entidad.getSoloNacional());
            rolconsola.setParameter("NacionalExp", entidad.getNacionalExp());
            rolconsola.setParameter("Estado", entidad.getEstado());
            rolconsola.setParameter("TipoCita", entidad.getTipoCita());
            rolconsola.setParameter("Adicional", entidad.getAgendaAdicional());
            rolconsola.setParameter("MinPermitida", entidad.getNoCitasMin());
            rolconsola.setParameter("MaxPermitida", entidad.getNoCitasMax());
            rolconsola.setParameter("Observaciones", entidad.getObservaciones());
            rolconsola.execute();
            return JSONObject.quote((String) rolconsola.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCParticipanteMod actualizar");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

}
