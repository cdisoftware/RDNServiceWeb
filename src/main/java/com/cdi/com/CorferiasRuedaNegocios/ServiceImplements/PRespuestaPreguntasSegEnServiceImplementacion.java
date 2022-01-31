package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.PRespuestaPreguntasSegEnEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.LogConsolaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PRespuestaPreguntasSegEnService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PRespuestaPreguntasSegEnServiceImplementacion implements PRespuestaPreguntasSegEnService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public String InsertarPreguntaSegEn(PRespuestaPreguntasSegEnEntity entidad, Integer Bandera, Integer IdUsuario) {
        try {
            StoredProcedureQuery rolpreguntaseg = repositorio.createNamedStoredProcedureQuery("paPRespuestaPreguntasSegEn");
            rolpreguntaseg.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            rolpreguntaseg.registerStoredProcedureParameter("IdEvaluacion", Integer.class, ParameterMode.IN);
            rolpreguntaseg.registerStoredProcedureParameter("IdUsuario", Integer.class, ParameterMode.IN);
            rolpreguntaseg.registerStoredProcedureParameter("RespuestaPre", String.class, ParameterMode.IN);
            rolpreguntaseg.registerStoredProcedureParameter("IdContacto", Integer.class, ParameterMode.IN);
            rolpreguntaseg.registerStoredProcedureParameter("IdPregunta", Integer.class, ParameterMode.IN);
            rolpreguntaseg.setParameter("Bandera", Bandera);
            rolpreguntaseg.setParameter("IdEvaluacion", entidad.getIdEvaluacion());
            rolpreguntaseg.setParameter("IdUsuario", IdUsuario);
            rolpreguntaseg.setParameter("RespuestaPre", entidad.getRespuesta());
            rolpreguntaseg.setParameter("IdContacto", entidad.getIdContacto());
            rolpreguntaseg.setParameter("IdPregunta", entidad.getIdPregunta());
            rolpreguntaseg.execute();
            return JSONObject.quote((String) rolpreguntaseg.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paPRespuestaPreguntasSegEn insertar");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

    @Override
    public String ActualizarPreguntaSegEn(PRespuestaPreguntasSegEnEntity entidad, Integer Bandera, Integer IdUsuario) {
        try {
            StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("paPRespuestaPreguntasSegEn");
            rolconsola.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdEvaluacion", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdUsuario", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("RespuestaPre", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdContacto", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdPregunta", Integer.class, ParameterMode.IN);
            rolconsola.setParameter("Bandera", Bandera);
            rolconsola.setParameter("IdEvaluacion", entidad.getIdEvaluacion());
            rolconsola.setParameter("IdUsuario", IdUsuario);
            rolconsola.setParameter("RespuestaPre", entidad.getRespuesta());
            rolconsola.setParameter("IdContacto", entidad.getIdContacto());
            rolconsola.setParameter("IdPregunta", entidad.getIdPregunta());
            rolconsola.execute();
            return JSONObject.quote((String) rolconsola.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paPRespuestaPreguntasSegEn actualizar");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

}
