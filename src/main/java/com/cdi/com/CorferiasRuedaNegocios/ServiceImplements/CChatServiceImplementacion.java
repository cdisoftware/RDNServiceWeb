package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CChatEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.CChatService;
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
public class CChatServiceImplementacion implements CChatService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public List<CChatEntity> ConsultaChat(Integer Bandera, String Idioma, Integer RuedaNegocio, Integer IdRuedaNegocio, 
            Integer TipoChat, Integer IdJornada, Integer IdChat) {
        try {
            StoredProcedureQuery permisos = repositorio.createNamedStoredProcedureQuery("paCChat");
            permisos.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("RuedaNegocio", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdRuedaNegocio", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("TipoChat", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdJornada", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdChat", Integer.class, ParameterMode.IN);
            permisos.setParameter("Bandera", Bandera);
            permisos.setParameter("Idioma", Idioma);
            permisos.setParameter("RuedaNegocio", RuedaNegocio);
            permisos.setParameter("IdRuedaNegocio", IdRuedaNegocio);
            permisos.setParameter("TipoChat", TipoChat);
            permisos.setParameter("IdJornada", IdJornada);
            permisos.setParameter("IdChat", IdChat);
            return permisos.getResultList();
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCChat");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

    @Override
    public String InsertarChat(CChatEntity entidad, Integer Bandera, String Idioma, 
            Integer IdUsuario) {
          try {
            StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("paCChatMod");
            rolconsola.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdUsuario", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdChat", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdRuedaNegocio", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TipoChat", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdJornada", Integer.class, ParameterMode.IN);
            //rolconsola.registerStoredProcedureParameter("FechaInicio", Integer.class, ParameterMode.IN);
            //rolconsola.registerStoredProcedureParameter("FechaFin", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("FechaActiva", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("HoraDesde", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("HoraHasta", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Mensaje", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            rolconsola.setParameter("Bandera", Bandera);
            rolconsola.setParameter("Idioma", Idioma);
            rolconsola.setParameter("IdUsuario", IdUsuario);
            rolconsola.setParameter("IdChat", entidad.getIdChat());
            rolconsola.setParameter("IdRuedaNegocio", entidad.getIdRuedaNegocio());
            rolconsola.setParameter("TipoChat", entidad.getIdTipoChat());
            rolconsola.setParameter("IdJornada", entidad.getIdJornadaActiva());
            //rolconsola.setParameter("FechaInicio", entidad.getFechaActiva());
            //rolconsola.setParameter("FechaFin", entidad.getEstado());
            rolconsola.setParameter("FechaActiva", entidad.getFechaActiva());
            rolconsola.setParameter("HoraDesde", entidad.getHoraDesde());
            rolconsola.setParameter("HoraHasta", entidad.getHoraHasta());
            rolconsola.setParameter("Mensaje", entidad.getMensaje());
            rolconsola.setParameter("Estado", entidad.getEstado());
            rolconsola.execute();
            return JSONObject.quote((String) rolconsola.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCChatMod insertar");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

    @Override
    public String ActualizarChat(CChatEntity entidad, Integer Bandera, String Idioma, Integer IdUsuario) {
           try {
            StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("paCChatMod");
            rolconsola.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdUsuario", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdChat", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdRuedaNegocio", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TipoChat", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdJornada", Integer.class, ParameterMode.IN);
            //rolconsola.registerStoredProcedureParameter("FechaInicio", Integer.class, ParameterMode.IN);
            //rolconsola.registerStoredProcedureParameter("FechaFin", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("FechaActiva", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("HoraDesde", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("HoraHasta", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Mensaje", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            rolconsola.setParameter("Bandera", Bandera);
            rolconsola.setParameter("Idioma", Idioma);
            rolconsola.setParameter("IdUsuario", IdUsuario);
            rolconsola.setParameter("IdChat", entidad.getIdChat());
            rolconsola.setParameter("IdRuedaNegocio", entidad.getIdRuedaNegocio());
            rolconsola.setParameter("TipoChat", entidad.getIdTipoChat());
            rolconsola.setParameter("IdJornada", entidad.getIdJornadaActiva());
            //rolconsola.setParameter("FechaInicio", entidad.getFechaActiva());
            //rolconsola.setParameter("FechaFin", entidad.getEstado());
            rolconsola.setParameter("FechaActiva", entidad.getFechaActiva());
            rolconsola.setParameter("HoraDesde", entidad.getHoraDesde());
            rolconsola.setParameter("HoraHasta", entidad.getHoraHasta());
            rolconsola.setParameter("Mensaje", entidad.getMensaje());
            rolconsola.setParameter("Estado", entidad.getEstado());
            rolconsola.execute();
            return JSONObject.quote((String) rolconsola.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCChatMod actualizar");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

}
