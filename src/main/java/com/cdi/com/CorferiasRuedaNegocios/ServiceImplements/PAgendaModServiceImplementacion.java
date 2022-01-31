package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.PAgendaModEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.LogConsolaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PAgendaModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PAgendaModServiceImplementacion implements PAgendaModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public String InsertarPAgenda(PAgendaModEntity entidad, Integer Bandera, Integer Aprueba) {
        try {
            StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("paPAgendaMod");
            rolconsola.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdUsuarioC", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdParticipanteS", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdParticipanteA", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdRuedaNegocio", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdAgenda", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("FechaCita", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("HoraCita", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Aprueba", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Motivocancelacion", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("MotivoRechazo", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("MotivoReagenda", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdEstado", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdContacto", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdContactoA", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("MotivoReserva", String.class, ParameterMode.IN);
            rolconsola.setParameter("Bandera", Bandera);
            rolconsola.setParameter("IdUsuarioC", entidad.getIdUsuarioC());
            rolconsola.setParameter("IdParticipanteS", entidad.getIdParticipanteS());
            rolconsola.setParameter("IdParticipanteA", entidad.getIdParticipanteA());
            rolconsola.setParameter("IdRuedaNegocio", entidad.getIdRuedaNegocio());
            rolconsola.setParameter("IdAgenda", entidad.getIdAgenda());
            rolconsola.setParameter("FechaCita", entidad.getFechaCita());
            rolconsola.setParameter("HoraCita", entidad.getHoraCita());
            rolconsola.setParameter("Aprueba", Aprueba);
            rolconsola.setParameter("Motivocancelacion", entidad.getMotivocancelacion());
            rolconsola.setParameter("MotivoRechazo", entidad.getMotivoRechazo());
            rolconsola.setParameter("MotivoReagenda", entidad.getFechaReagenda());
            rolconsola.setParameter("IdEstado", entidad.getEstadoCita());
            rolconsola.setParameter("IdContacto", entidad.getIdContactoS());
            rolconsola.setParameter("IdContactoA", entidad.getIdContactoA());
            rolconsola.setParameter("MotivoReserva", entidad.getMotivoReserva());
            rolconsola.execute();
            return JSONObject.quote((String) rolconsola.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paPAgendaMod insertar");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

    @Override
    public String ActualizarPAgenda(PAgendaModEntity entidad, Integer Bandera, Integer Aprueba) {
        try {
            StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("paPAgendaMod");
            rolconsola.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdUsuarioC", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdParticipanteS", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdParticipanteA", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdRuedaNegocio", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdAgenda", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("FechaCita", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("HoraCita", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Aprueba", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Motivocancelacion", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("MotivoRechazo", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("MotivoReagenda", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdEstado", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdContacto", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdContactoA", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("MotivoReserva", String.class, ParameterMode.IN);
            rolconsola.setParameter("Bandera", Bandera);
            rolconsola.setParameter("IdUsuarioC", entidad.getIdUsuarioC());
            rolconsola.setParameter("IdParticipanteS", entidad.getIdParticipanteS());
            rolconsola.setParameter("IdParticipanteA", entidad.getIdParticipanteA());
            rolconsola.setParameter("IdRuedaNegocio", entidad.getIdRuedaNegocio());
            rolconsola.setParameter("IdAgenda", entidad.getIdAgenda());
            rolconsola.setParameter("FechaCita", entidad.getFechaCita());
            rolconsola.setParameter("HoraCita", entidad.getHoraCita());
            rolconsola.setParameter("Aprueba", Aprueba);
            rolconsola.setParameter("Motivocancelacion", entidad.getMotivocancelacion());
            rolconsola.setParameter("MotivoRechazo", entidad.getMotivoRechazo());
            rolconsola.setParameter("MotivoReagenda", entidad.getMotivoReagenda());
            rolconsola.setParameter("IdEstado", entidad.getEstadoCita());
            rolconsola.setParameter("IdContacto", entidad.getIdContactoS());
            rolconsola.setParameter("IdContactoA", entidad.getIdContactoA());
            rolconsola.setParameter("MotivoReserva", entidad.getMotivoReserva());
            rolconsola.execute();
            return JSONObject.quote((String) rolconsola.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paPAgendaMod actualizar");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

}
