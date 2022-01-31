package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.PRespuestaPreguntasRegEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.LogConsolaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PRespuestaPreguntasRegService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PRespuestaPreguntasRegServiceImplementacion implements PRespuestaPreguntasRegService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public String InsertarRespuestasPreguntas(PRespuestaPreguntasRegEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("paPRespuestaPreguntasReg");
            rolconsola.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdRuedaNegocio", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Idpregunta", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdParticipante", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("RespuestaPre", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdUsuario", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Origen", Integer.class, ParameterMode.IN);
            rolconsola.setParameter("Bandera", Bandera);
            rolconsola.setParameter("IdRuedaNegocio", entidad.getIdRuedaNegocio());
            rolconsola.setParameter("Idpregunta", entidad.getIdPregunta());
            rolconsola.setParameter("IdParticipante", entidad.getIdParticipante());
            rolconsola.setParameter("RespuestaPre", entidad.getRespuesta());
            rolconsola.setParameter("Estado", entidad.getEstado());
            rolconsola.setParameter("IdUsuario", entidad.getIdUsuarioC());
            rolconsola.setParameter("Origen", entidad.getOrigen());
            rolconsola.execute();
            return JSONObject.quote((String) rolconsola.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paPRespuestaPreguntasReg insertar");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

    @Override
    public String ActualizarRespuestasPreguntas(PRespuestaPreguntasRegEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("paPRespuestaPreguntasReg");
            rolconsola.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdRuedaNegocio", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Idpregunta", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdParticipante", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("RespuestaPre", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdUsuario", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Origen", Integer.class, ParameterMode.IN);
            rolconsola.setParameter("Bandera", Bandera);
            rolconsola.setParameter("IdRuedaNegocio", entidad.getIdRuedaNegocio());
            rolconsola.setParameter("Idpregunta", entidad.getIdPregunta());
            rolconsola.setParameter("IdParticipante", entidad.getIdParticipante());
            rolconsola.setParameter("RespuestaPre", entidad.getRespuesta());
            rolconsola.setParameter("Estado", entidad.getEstado());
            rolconsola.setParameter("IdUsuario", entidad.getIdUsuarioC());
            rolconsola.setParameter("Origen", entidad.getOrigen());
            rolconsola.execute();
            return JSONObject.quote((String) rolconsola.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paPRespuestaPreguntasReg actualizar");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }
}
