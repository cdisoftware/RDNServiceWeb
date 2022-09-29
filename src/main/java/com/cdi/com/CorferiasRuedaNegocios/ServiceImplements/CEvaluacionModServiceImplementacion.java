package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CEvaluacionModEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.CEvaluacionModService;
import com.cdi.com.CorferiasRuedaNegocios.Services.LogConsolaService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CEvaluacionModServiceImplementacion implements CEvaluacionModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public String InsertarEvaluacion(CEvaluacionModEntity entidad, Integer Bandera, String Idioma, Integer IdUsuario, Integer IdEvaluacion) {
        try {
            StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("paCEvaluacionMod");
            rolconsola.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdUsuario", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdEvaluacion", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdRuedaNegocio", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Nombre", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("FechaActivacion", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("FechaInactivacion", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TipoPerfil", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("RequiereFirma", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Publicar", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Imagen", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TipoEva", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("ImagenBit", String.class, ParameterMode.IN);

            rolconsola.setParameter("Bandera", Bandera);
            rolconsola.setParameter("Idioma", Idioma);
            rolconsola.setParameter("IdUsuario", IdUsuario);
            rolconsola.setParameter("IdEvaluacion", IdEvaluacion);
            rolconsola.setParameter("IdRuedaNegocio", entidad.getIdRuedaNegocio());
            rolconsola.setParameter("Nombre", entidad.getNombreEvaluacion());
            rolconsola.setParameter("FechaActivacion", entidad.getFechaActivacion());
            rolconsola.setParameter("FechaInactivacion", entidad.getFechaInactiva());
            rolconsola.setParameter("TipoPerfil", entidad.getIdPerfilRueda());
            rolconsola.setParameter("RequiereFirma", entidad.getRequiereFirma());
            rolconsola.setParameter("Estado", entidad.getEstado());
            rolconsola.setParameter("Publicar", entidad.getPublicar());
            rolconsola.setParameter("Imagen", entidad.getImagen());
            rolconsola.setParameter("TipoEva", entidad.getIdTipoEvaEnc());
            rolconsola.setParameter("ImagenBit", entidad.getImagenBit());
            rolconsola.execute();
            return JSONObject.quote((String) rolconsola.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCEvaluacionMod insertar");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

    @Override
    public String ActualizarEvaluacion(CEvaluacionModEntity entidad, Integer Bandera, String Idioma, Integer IdUsuario, Integer IdEvaluacion) {
        try {
            StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("paCEvaluacionMod");
            rolconsola.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdUsuario", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdEvaluacion", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdRuedaNegocio", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Nombre", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("FechaActivacion", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("FechaInactivacion", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TipoPerfil", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("RequiereFirma", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Publicar", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Imagen", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TipoEva", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("ImagenBit", String.class, ParameterMode.IN);

            rolconsola.setParameter("Bandera", Bandera);
            rolconsola.setParameter("Idioma", Idioma);
            rolconsola.setParameter("IdUsuario", IdUsuario);
            rolconsola.setParameter("IdEvaluacion", IdEvaluacion);
            rolconsola.setParameter("IdRuedaNegocio", entidad.getIdRuedaNegocio());
            rolconsola.setParameter("Nombre", entidad.getNombreEvaluacion());
            rolconsola.setParameter("FechaActivacion", entidad.getFechaActivacion());
            rolconsola.setParameter("FechaInactivacion", entidad.getFechaInactiva());
            rolconsola.setParameter("TipoPerfil", entidad.getIdPerfilRueda());
            rolconsola.setParameter("RequiereFirma", entidad.getRequiereFirma());
            rolconsola.setParameter("Estado", entidad.getEstado());
            rolconsola.setParameter("Publicar", entidad.getPublicar());
            rolconsola.setParameter("Imagen", entidad.getImagen());
            rolconsola.setParameter("TipoEva", entidad.getIdTipoEvaEnc());
            rolconsola.setParameter("ImagenBit", entidad.getImagenBit());
            rolconsola.execute();
            return JSONObject.quote((String) rolconsola.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCEvaluacionMod actualizar");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

}
