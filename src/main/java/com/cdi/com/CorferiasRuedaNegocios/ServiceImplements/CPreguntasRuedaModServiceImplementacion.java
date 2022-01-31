package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CPreguntasRuedaModEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.CPreguntasRuedaModService;
import com.cdi.com.CorferiasRuedaNegocios.Services.LogConsolaService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CPreguntasRuedaModServiceImplementacion implements CPreguntasRuedaModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public String InsertarPreguntasRueda(CPreguntasRuedaModEntity entidad, Integer Bandera, String Idioma) {
        try {
            StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("paCPreguntasRuedaMod");
            rolconsola.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdUsuario", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdRueda", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdPregunta", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TipoPregunta", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Pregunta", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("ListaRespuesta", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdPerfilRueda", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Inter", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Nacional", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdListaRespuesta", Integer.class, ParameterMode.IN);
            rolconsola.setParameter("Bandera", Bandera);
            rolconsola.setParameter("Idioma", Idioma);
            rolconsola.setParameter("IdUsuario", entidad.getIdUsuarioC());
            rolconsola.setParameter("IdRueda", entidad.getIdRuedaNegocio());
            rolconsola.setParameter("IdPregunta", entidad.getIdPregunta());
            rolconsola.setParameter("TipoPregunta", entidad.getIdTipoPregunta());
            rolconsola.setParameter("Pregunta", entidad.getPregunta());
            rolconsola.setParameter("ListaRespuesta", entidad.getRespuesta());
            rolconsola.setParameter("Estado", entidad.getEstado());
            rolconsola.setParameter("IdPerfilRueda", entidad.getIdPerfilRueda());
            rolconsola.setParameter("Inter", entidad.getInternacional());
            rolconsola.setParameter("Nacional", entidad.getNacional());
            rolconsola.setParameter("IdListaRespuesta", entidad.getIdListaRespuesta());
            rolconsola.execute();
            return JSONObject.quote((String) rolconsola.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCPreguntasRuedaMod insertar");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

    @Override
    public String ActualizarPreguntasRueda(CPreguntasRuedaModEntity entidad, Integer Bandera, String Idioma) {
        try {
            StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("paCPreguntasRuedaMod");
            rolconsola.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdUsuario", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdRueda", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdPregunta", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TipoPregunta", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Pregunta", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("ListaRespuesta", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdPerfilRueda", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Inter", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Nacional", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdListaRespuesta", Integer.class, ParameterMode.IN);
            rolconsola.setParameter("Bandera", Bandera);
            rolconsola.setParameter("Idioma", Idioma);
            rolconsola.setParameter("IdUsuario", entidad.getIdUsuarioC());
            rolconsola.setParameter("IdRueda", entidad.getIdRuedaNegocio());
            rolconsola.setParameter("IdPregunta", entidad.getIdPregunta());
            rolconsola.setParameter("TipoPregunta", entidad.getIdTipoPregunta());
            rolconsola.setParameter("Pregunta", entidad.getPregunta());
            rolconsola.setParameter("ListaRespuesta", entidad.getRespuesta());
            rolconsola.setParameter("Estado", entidad.getEstado());
            rolconsola.setParameter("IdPerfilRueda", entidad.getIdPerfilRueda());
            rolconsola.setParameter("Inter", entidad.getInternacional());
            rolconsola.setParameter("Nacional", entidad.getNacional());
            rolconsola.setParameter("IdListaRespuesta", entidad.getIdListaRespuesta());
            rolconsola.execute();
            return JSONObject.quote((String) rolconsola.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCPreguntasRuedaMod actualizar");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

}
