package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CNotificacionEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.CNotificacionService;
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
public class CNotificacionServiceImplementacion implements CNotificacionService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public List<CNotificacionEntity> ConsultaNotificacionesC(CNotificacionEntity entidad, Integer bandera, String Idioma,
            String NombreRueda, Integer IdRueda, Integer TipoPerfil,  
            Integer IdSector, Integer Estado, Integer Publicar, String TituloNoti,
            Integer IdNotifica) {
        try {
            StoredProcedureQuery permisos = repositorio.createNamedStoredProcedureQuery("paCNotificacion");
            permisos.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("NombreRueda", String.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdRueda", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("TipoPerfil", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("Fecha", String.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdSector", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("Publicar", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("TituloNoti", String.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdNotifica", Integer.class, ParameterMode.IN);
            permisos.setParameter("bandera", bandera);
            permisos.setParameter("Idioma", Idioma);
            permisos.setParameter("NombreRueda", NombreRueda);
            permisos.setParameter("IdRueda", IdRueda);
            permisos.setParameter("TipoPerfil", TipoPerfil);
            permisos.setParameter("Fecha", entidad.getFechaProgramada());
            permisos.setParameter("IdSector", IdSector);
            permisos.setParameter("Estado", Estado);
            permisos.setParameter("Publicar", Publicar);
            permisos.setParameter("TituloNoti", TituloNoti);
            permisos.setParameter("IdNotifica", IdNotifica);
            return permisos.getResultList();
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCNotificacion");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

    @Override
    public String InsertarNotificacionesC(CNotificacionEntity entidad, Integer bandera,
            String Idioma, Integer IdUsuario) {
        try {
            StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("paCNotificacionMod");
            rolconsola.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdNotifica", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdRueda", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdTipoProg", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TipoPerfil", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdSector", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdUsuario", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Titulo", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Texto", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Imagen", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("FechaProgramada", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Publicar", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TituloNoti", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("HoraProg", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdEvaluacion", Integer.class, ParameterMode.IN);
            rolconsola.setParameter("bandera", bandera);
            rolconsola.setParameter("Idioma", Idioma);
            rolconsola.setParameter("IdNotifica", entidad.getIdNotificacion());
            rolconsola.setParameter("IdRueda", entidad.getIdRuedaNegocio());
            rolconsola.setParameter("IdTipoProg", entidad.getIdTipoProgramacion());
            rolconsola.setParameter("TipoPerfil", entidad.getIdPerfilRueda());
            rolconsola.setParameter("IdSector", entidad.getIdSector());
            rolconsola.setParameter("IdUsuario", IdUsuario);
            rolconsola.setParameter("Titulo", entidad.getTitulo());
            rolconsola.setParameter("Texto", entidad.getTexto());
            rolconsola.setParameter("Imagen", entidad.getImagen());
            rolconsola.setParameter("FechaProgramada", entidad.getFechaProgramada());
            rolconsola.setParameter("Publicar", entidad.getPublicar());
            rolconsola.setParameter("Estado", entidad.getEstado());
            rolconsola.setParameter("TituloNoti", entidad.getNombrenotificacion());
            rolconsola.setParameter("HoraProg", entidad.getHoraProgramada());
            rolconsola.setParameter("IdEvaluacion", entidad.getIdEvaluacion());
            rolconsola.execute();
            return JSONObject.quote((String) rolconsola.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCNotificacionMod insertar");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

    @Override
    public String ActualizarNotificacionesC(CNotificacionEntity entidad, Integer bandera, String Idioma, Integer IdUsuario) {
        try {
            StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("paCNotificacionMod");
            rolconsola.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdNotifica", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdRueda", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdTipoProg", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TipoPerfil", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdSector", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdUsuario", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Titulo", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Texto", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Imagen", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("FechaProgramada", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Publicar", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TituloNoti", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("HoraProg", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdEvaluacion", Integer.class, ParameterMode.IN);
            rolconsola.setParameter("bandera", bandera);
            rolconsola.setParameter("Idioma", Idioma);
            rolconsola.setParameter("IdNotifica", entidad.getIdNotificacion());
            rolconsola.setParameter("IdRueda", entidad.getIdRuedaNegocio());
            rolconsola.setParameter("IdTipoProg", entidad.getIdTipoProgramacion());
            rolconsola.setParameter("TipoPerfil", entidad.getIdPerfilRueda());
            rolconsola.setParameter("IdSector", entidad.getIdSector());
            rolconsola.setParameter("IdUsuario", IdUsuario);
            rolconsola.setParameter("Titulo", entidad.getTitulo());
            rolconsola.setParameter("Texto", entidad.getTexto());
            rolconsola.setParameter("Imagen", entidad.getImagen());
            rolconsola.setParameter("FechaProgramada", entidad.getFechaProgramada());
            rolconsola.setParameter("Publicar", entidad.getPublicar());
            rolconsola.setParameter("Estado", entidad.getEstado());
            rolconsola.setParameter("TituloNoti", entidad.getNombrenotificacion());
            rolconsola.setParameter("HoraProg", entidad.getHoraProgramada());
            rolconsola.setParameter("IdEvaluacion", entidad.getIdEvaluacion());
            rolconsola.execute();
            return JSONObject.quote((String) rolconsola.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCNotificacionMod actualizar");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

   

}
