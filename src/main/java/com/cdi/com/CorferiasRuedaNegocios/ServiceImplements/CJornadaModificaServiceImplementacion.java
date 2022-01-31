package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CJornadaModificaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.CJornadaModificaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.LogConsolaService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CJornadaModificaServiceImplementacion implements CJornadaModificaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public String InsertarJornada(CJornadaModificaEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("paCJornadaModifica");
            rolconsola.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdUsuario", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdJornada", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdRuedaNegocio", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdTipoJornada", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TipoEvento", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("FechaJornada", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("FechaActivacion", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("HoraDesde", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("HoraHasta", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Duracion", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Espacios", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("CantidadCitas", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Observaciones", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Contexto", String.class, ParameterMode.IN);            
            rolconsola.setParameter("Bandera", Bandera);
            rolconsola.setParameter("IdUsuario", entidad.getIdUsuarioC());
            rolconsola.setParameter("IdJornada", entidad.getIdJornada());
            rolconsola.setParameter("IdRuedaNegocio", entidad.getIdRuedaNegocio());
            rolconsola.setParameter("IdTipoJornada", entidad.getIdTipoJornada());
            rolconsola.setParameter("TipoEvento", entidad.getTipoEvento());
            rolconsola.setParameter("Estado", entidad.getEstado());
            rolconsola.setParameter("FechaJornada", entidad.getFechaJornada());
            rolconsola.setParameter("FechaActivacion", entidad.getFechaactiva());
            rolconsola.setParameter("HoraDesde", entidad.getHoraDesde());
            rolconsola.setParameter("HoraHasta", entidad.getHoraHasta());
            rolconsola.setParameter("Duracion", entidad.getDuracion());
            rolconsola.setParameter("Espacios", entidad.getEspacios());
            rolconsola.setParameter("CantidadCitas", entidad.getCantidadCitas());
            rolconsola.setParameter("Observaciones", entidad.getObservaciones());
            rolconsola.setParameter("Contexto", entidad.getContexto());
            rolconsola.execute();
            return JSONObject.quote((String) rolconsola.getOutputParameterValue("respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCJornadaModifica insertar");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

    @Override
    public String ActualizarJornada(CJornadaModificaEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("paCJornadaModifica");
            rolconsola.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdUsuario", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdJornada", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdRuedaNegocio", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdTipoJornada", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TipoEvento", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("FechaJornada", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("FechaActivacion", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("HoraDesde", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("HoraHasta", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Duracion", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Espacios", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("CantidadCitas", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Observaciones", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Contexto", String.class, ParameterMode.IN); 
            rolconsola.setParameter("Bandera", Bandera);
            rolconsola.setParameter("IdUsuario", entidad.getIdUsuarioC());
            rolconsola.setParameter("IdJornada", entidad.getIdJornada());
            rolconsola.setParameter("IdRuedaNegocio", entidad.getIdRuedaNegocio());
            rolconsola.setParameter("IdTipoJornada", entidad.getIdTipoJornada());
            rolconsola.setParameter("TipoEvento", entidad.getTipoEvento());
            rolconsola.setParameter("Estado", entidad.getEstado());
            rolconsola.setParameter("FechaJornada", entidad.getFechaJornada());
            rolconsola.setParameter("FechaActivacion", entidad.getFechaactiva());
            rolconsola.setParameter("HoraDesde", entidad.getHoraDesde());
            rolconsola.setParameter("HoraHasta", entidad.getHoraHasta());
            rolconsola.setParameter("Duracion", entidad.getDuracion());
            rolconsola.setParameter("Espacios", entidad.getEspacios());
            rolconsola.setParameter("CantidadCitas", entidad.getCantidadCitas());
            rolconsola.setParameter("Observaciones", entidad.getObservaciones());
            rolconsola.setParameter("Contexto", entidad.getContexto());
            rolconsola.execute();
            return JSONObject.quote((String) rolconsola.getOutputParameterValue("respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCJornadaModifica actualizar");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

}
