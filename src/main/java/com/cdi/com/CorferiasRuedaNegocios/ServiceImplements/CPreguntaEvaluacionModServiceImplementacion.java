package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CPreguntaEvaluacionModeEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.CPreguntaEvaluacionModService;
import com.cdi.com.CorferiasRuedaNegocios.Services.LogConsolaService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CPreguntaEvaluacionModServiceImplementacion implements CPreguntaEvaluacionModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public String InsertaPreguntasEvaluacion(CPreguntaEvaluacionModeEntity entidad,
            Integer Bandera, String Idioma, Integer IdOrigen) {
        try {
            StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("paCPreguntaEvaluacionMod");
            rolconsola.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdUsuario", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdEvaluacion", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdPregunta", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TipoPregunta", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Pregunta", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdOrigen", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Orden", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("RespuestaEva", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdListaRespuesta", Integer.class, ParameterMode.IN);
            rolconsola.setParameter("Bandera", Bandera);
            rolconsola.setParameter("Idioma", Idioma);
            rolconsola.setParameter("IdUsuario", entidad.getIdUsuarioC());
            rolconsola.setParameter("IdEvaluacion", entidad.getIdEvaluacion());
            rolconsola.setParameter("IdPregunta", entidad.getIdPregunta());
            rolconsola.setParameter("TipoPregunta", entidad.getIdTipoPregunta());
            rolconsola.setParameter("Pregunta", entidad.getPregunta());
            rolconsola.setParameter("IdOrigen", IdOrigen);
            rolconsola.setParameter("Orden", entidad.getOrden());
            rolconsola.setParameter("RespuestaEva", entidad.getRespuesta());
            rolconsola.setParameter("Estado", entidad.getEstado());
            rolconsola.setParameter("IdListaRespuesta", entidad.getIdListaRespuesta());
            rolconsola.execute();
            return JSONObject.quote((String) rolconsola.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCPreguntaEvaluacionMod insertar");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

    @Override
    public String ActualizarPreguntasEvaluacion(CPreguntaEvaluacionModeEntity entidad, Integer Bandera, String Idioma, Integer IdOrigen) {
        try {
            StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("paCPreguntaEvaluacionMod");
            rolconsola.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdUsuario", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdEvaluacion", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdPregunta", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TipoPregunta", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Pregunta", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdOrigen", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Orden", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("RespuestaEva", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdListaRespuesta", Integer.class, ParameterMode.IN);
            rolconsola.setParameter("Bandera", Bandera);
            rolconsola.setParameter("Idioma", Idioma);
            rolconsola.setParameter("IdUsuario", entidad.getIdUsuarioC());
            rolconsola.setParameter("IdEvaluacion", entidad.getIdEvaluacion());
            rolconsola.setParameter("IdPregunta", entidad.getIdPregunta());
            rolconsola.setParameter("TipoPregunta", entidad.getIdTipoPregunta());
            rolconsola.setParameter("Pregunta", entidad.getPregunta());
            rolconsola.setParameter("IdOrigen", IdOrigen);
            rolconsola.setParameter("Orden", entidad.getOrden());
            rolconsola.setParameter("RespuestaEva", entidad.getRespuesta());
            rolconsola.setParameter("Estado", entidad.getEstado());
            rolconsola.setParameter("IdListaRespuesta", entidad.getIdListaRespuesta());
            rolconsola.execute();
            return JSONObject.quote((String) rolconsola.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCPreguntaEvaluacionMod insertar");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

}
