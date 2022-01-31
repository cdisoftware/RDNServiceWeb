package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CPreguntasContenidoEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.CPreguntasContenidoService;
import com.cdi.com.CorferiasRuedaNegocios.Services.LogConsolaService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CPreguntasContenidoServiceImplementacion implements CPreguntasContenidoService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public List<CPreguntasContenidoEntity> ConsultarPreguntasContenido(Integer Bandera, Integer IdRueda, String Idioma) {
        try {
            StoredProcedureQuery permisos = repositorio.createNamedStoredProcedureQuery("paCPreguntasContenido");
            permisos.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdRueda", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            permisos.setParameter("Bandera", Bandera);
            permisos.setParameter("IdRueda", IdRueda);
            permisos.setParameter("Idioma", Idioma);
            return permisos.getResultList();
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCPreguntasContenido");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

    @Override
    public String InsertarPreguntasContenido(CPreguntasContenidoEntity entidad, Integer Bandera, String Idioma) {
           try {
            StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("paCPreguntaContenidoMod");
            rolconsola.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdPreguntaC", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdRueda", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdUsuarioC", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("PreguntaUno", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("RespuestaUno", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("PreguntaDos", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("RespuestaDos", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("PreguntaTres", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("RespuestaTres", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("PreguntaCuatro", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("RespuestaCuatro", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("PreguntaCinco", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("RespuestaCinco", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("PreguntaSeis", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("RespuestaSeis", String.class, ParameterMode.IN);
            rolconsola.setParameter("Bandera", Bandera);
            rolconsola.setParameter("Idioma", Idioma);
            rolconsola.setParameter("IdPreguntaC", entidad.getIdPreguntaC());
            rolconsola.setParameter("IdRueda", entidad.getIdRuedaNegocio());
            rolconsola.setParameter("IdUsuarioC", entidad.getIdUsuarioC());
            rolconsola.setParameter("PreguntaUno", entidad.getPreguntaUno());
            rolconsola.setParameter("RespuestaUno", entidad.getRespuestaUno());
            rolconsola.setParameter("PreguntaDos", entidad.getPreguntaDos());
            rolconsola.setParameter("RespuestaDos", entidad.getRespuestaDos());
            rolconsola.setParameter("PreguntaTres", entidad.getPreguntaTres());
            rolconsola.setParameter("RespuestaTres", entidad.getRespuestaTres());
            rolconsola.setParameter("PreguntaCuatro", entidad.getPreguntaCuatro());
            rolconsola.setParameter("RespuestaCuatro", entidad.getRespuestaCuatro());
            rolconsola.setParameter("PreguntaCinco", entidad.getPreguntaCinco());
            rolconsola.setParameter("RespuestaCinco", entidad.getRespuestaCinco());
            rolconsola.setParameter("PreguntaSeis", entidad.getPreguntaSeis());
            rolconsola.setParameter("RespuestaSeis", entidad.getRespuestaSeis());
            rolconsola.execute();
            return JSONObject.quote((String) rolconsola.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCPreguntaContenidoMod insertar");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

    @Override
    public String ActualizarPreguntasContenido(CPreguntasContenidoEntity entidad, Integer Bandera, String Idioma) {
          try {
            StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("paCPreguntaContenidoMod");
            rolconsola.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdPreguntaC", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdRueda", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdUsuarioC", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("PreguntaUno", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("RespuestaUno", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("PreguntaDos", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("RespuestaDos", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("PreguntaTres", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("RespuestaTres", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("PreguntaCuatro", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("RespuestaCuatro", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("PreguntaCinco", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("RespuestaCinco", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("PreguntaSeis", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("RespuestaSeis", String.class, ParameterMode.IN);
            rolconsola.setParameter("Bandera", Bandera);
            rolconsola.setParameter("Idioma", Idioma);
            rolconsola.setParameter("IdPreguntaC", entidad.getIdPreguntaC());
            rolconsola.setParameter("IdRueda", entidad.getIdRuedaNegocio());
            rolconsola.setParameter("IdUsuarioC", entidad.getIdUsuarioC());
            rolconsola.setParameter("PreguntaUno", entidad.getPreguntaUno());
            rolconsola.setParameter("RespuestaUno", entidad.getRespuestaUno());
            rolconsola.setParameter("PreguntaDos", entidad.getPreguntaDos());
            rolconsola.setParameter("RespuestaDos", entidad.getRespuestaDos());
            rolconsola.setParameter("PreguntaTres", entidad.getPreguntaTres());
            rolconsola.setParameter("RespuestaTres", entidad.getRespuestaTres());
            rolconsola.setParameter("PreguntaCuatro", entidad.getPreguntaCuatro());
            rolconsola.setParameter("RespuestaCuatro", entidad.getRespuestaCuatro());
            rolconsola.setParameter("PreguntaCinco", entidad.getPreguntaCinco());
            rolconsola.setParameter("RespuestaCinco", entidad.getRespuestaCinco());
            rolconsola.setParameter("PreguntaSeis", entidad.getPreguntaSeis());
            rolconsola.setParameter("RespuestaSeis", entidad.getRespuestaSeis());
            rolconsola.execute();
            return JSONObject.quote((String) rolconsola.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCPreguntaContenidoMod actualizar");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

}
