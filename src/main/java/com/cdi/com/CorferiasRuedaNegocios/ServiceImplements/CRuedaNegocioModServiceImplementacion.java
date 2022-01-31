package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CRuedaNegocioModEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.CRuedaNegocioModService;
import com.cdi.com.CorferiasRuedaNegocios.Services.LogConsolaService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CRuedaNegocioModServiceImplementacion implements CRuedaNegocioModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public String InsertarRuedaNegocio(CRuedaNegocioModEntity entidad, Integer bandera, String Idioma) {
        try {
            StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("paCRuedaNegocioMod");
            rolconsola.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdRuedaNegocio", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("NombreRDN", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("DescripcionRDN", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdTipoRueda", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdUbicacion", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdClaseRueda", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdPais", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdDepartamento", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdCiudad", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdRecinto", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Direccion", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("FechaInicioRdn", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("FechaFinRdn", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("NoCitasMin", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("NoCitasMax", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("AprobacionCitas", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("AprobacionParticipante", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("FechaInicioAgendamiento", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdTipoCierre", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("CierreAgendamiento", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("HoraAgendamiento", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("CitaOferente", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("CitaDemandante", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("FechaLimiteReg", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Imagen", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdUsuarioC", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Publicar", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Visible", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("DoblePerfil", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdFeria", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("NombreFeria", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("ImagenPdf", String.class, ParameterMode.IN);
            rolconsola.setParameter("bandera", bandera);
            rolconsola.setParameter("Idioma", Idioma);
            rolconsola.setParameter("IdRuedaNegocio", entidad.getIdRuedaNegocio());
            rolconsola.setParameter("NombreRDN", entidad.getNombreRDN());
            rolconsola.setParameter("DescripcionRDN", entidad.getDescripcionRDN());
            rolconsola.setParameter("Estado", entidad.getEstado());
            rolconsola.setParameter("IdTipoRueda", entidad.getIdTipoRueda());
            rolconsola.setParameter("IdUbicacion", entidad.getIdUbicacion());
            rolconsola.setParameter("IdClaseRueda", entidad.getIdClaseRueda());
            rolconsola.setParameter("IdPais", entidad.getIdPais());
            rolconsola.setParameter("IdDepartamento", entidad.getIdDepartamento());
            rolconsola.setParameter("IdCiudad", entidad.getIdCiudad());
            rolconsola.setParameter("IdRecinto", entidad.getIdRecinto());
            rolconsola.setParameter("Direccion", entidad.getDireccion());
            rolconsola.setParameter("FechaInicioRdn", entidad.getFechaInicioRdn());
            rolconsola.setParameter("FechaFinRdn", entidad.getFechaFinRdn());
            rolconsola.setParameter("NoCitasMin", entidad.getNoCitasMin());
            rolconsola.setParameter("NoCitasMax", entidad.getNoCitasMax());
            rolconsola.setParameter("AprobacionCitas", entidad.getAprobacionCitas());
            rolconsola.setParameter("AprobacionParticipante", entidad.getAprobacionParticipante());
            rolconsola.setParameter("FechaInicioAgendamiento", entidad.getFechaInicioAgendamiento());
            rolconsola.setParameter("IdTipoCierre", entidad.getIdTipoCierre());
            rolconsola.setParameter("CierreAgendamiento", entidad.getCierreAgendamiento());
            rolconsola.setParameter("HoraAgendamiento", entidad.getHoraAgendamiento());
            rolconsola.setParameter("CitaOferente", entidad.getCitaOferente());
            rolconsola.setParameter("CitaDemandante", entidad.getCitaDemandante());
            rolconsola.setParameter("FechaLimiteReg", entidad.getFechaLimiteReg());
            rolconsola.setParameter("Imagen", entidad.getImagen());
            rolconsola.setParameter("IdUsuarioC", entidad.getIdUsuarioC());
            rolconsola.setParameter("Publicar", entidad.getPublicar());
            rolconsola.setParameter("Visible", entidad.getVisible());
            rolconsola.setParameter("DoblePerfil", entidad.getDoblePerfil());
            rolconsola.setParameter("IdFeria", entidad.getIdFeria());
            rolconsola.setParameter("NombreFeria", entidad.getNombreFeria());
            rolconsola.setParameter("ImagenPdf", entidad.getImagenPdf());
            rolconsola.execute();
            return JSONObject.quote((String) rolconsola.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCRuedaNegocioMod insertar");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

    @Override
    public String ActualizarRuedaNegocio(CRuedaNegocioModEntity entidad, Integer bandera, String Idioma) {
        try {
            StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("paCRuedaNegocioMod");
            rolconsola.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdRuedaNegocio", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("NombreRDN", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("DescripcionRDN", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdTipoRueda", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdUbicacion", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdClaseRueda", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdPais", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdDepartamento", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdCiudad", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdRecinto", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Direccion", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("FechaInicioRdn", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("FechaFinRdn", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("NoCitasMin", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("NoCitasMax", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("AprobacionCitas", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("AprobacionParticipante", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("FechaInicioAgendamiento", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdTipoCierre", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("CierreAgendamiento", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("HoraAgendamiento", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("CitaOferente", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("CitaDemandante", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("FechaLimiteReg", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Imagen", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdUsuarioC", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Publicar", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Visible", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("DoblePerfil", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdFeria", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("NombreFeria", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("ImagenPdf", String.class, ParameterMode.IN);
            rolconsola.setParameter("bandera", bandera);
            rolconsola.setParameter("Idioma", Idioma);
            rolconsola.setParameter("IdRuedaNegocio", entidad.getIdRuedaNegocio());
            rolconsola.setParameter("NombreRDN", entidad.getNombreRDN());
            rolconsola.setParameter("DescripcionRDN", entidad.getDescripcionRDN());
            rolconsola.setParameter("Estado", entidad.getEstado());
            rolconsola.setParameter("IdTipoRueda", entidad.getIdTipoRueda());
            rolconsola.setParameter("IdUbicacion", entidad.getIdUbicacion());
            rolconsola.setParameter("IdClaseRueda", entidad.getIdClaseRueda());
            rolconsola.setParameter("IdPais", entidad.getIdPais());
            rolconsola.setParameter("IdDepartamento", entidad.getIdDepartamento());
            rolconsola.setParameter("IdCiudad", entidad.getIdCiudad());
            rolconsola.setParameter("IdRecinto", entidad.getIdRecinto());
            rolconsola.setParameter("Direccion", entidad.getDireccion());
            rolconsola.setParameter("FechaInicioRdn", entidad.getFechaInicioRdn());
            rolconsola.setParameter("FechaFinRdn", entidad.getFechaFinRdn());
            rolconsola.setParameter("NoCitasMin", entidad.getNoCitasMin());
            rolconsola.setParameter("NoCitasMax", entidad.getNoCitasMax());
            rolconsola.setParameter("AprobacionCitas", entidad.getAprobacionCitas());
            rolconsola.setParameter("AprobacionParticipante", entidad.getAprobacionParticipante());
            rolconsola.setParameter("FechaInicioAgendamiento", entidad.getFechaInicioAgendamiento());
            rolconsola.setParameter("IdTipoCierre", entidad.getIdTipoCierre());
            rolconsola.setParameter("CierreAgendamiento", entidad.getCierreAgendamiento());
            rolconsola.setParameter("HoraAgendamiento", entidad.getHoraAgendamiento());
            rolconsola.setParameter("CitaOferente", entidad.getCitaOferente());
            rolconsola.setParameter("CitaDemandante", entidad.getCitaDemandante());
            rolconsola.setParameter("FechaLimiteReg", entidad.getFechaLimiteReg());
            rolconsola.setParameter("Imagen", entidad.getImagen());
            rolconsola.setParameter("IdUsuarioC", entidad.getIdUsuarioC());
            rolconsola.setParameter("Publicar", entidad.getPublicar());
            rolconsola.setParameter("Visible", entidad.getVisible());
            rolconsola.setParameter("DoblePerfil", entidad.getDoblePerfil());
            rolconsola.setParameter("IdFeria", entidad.getIdFeria());
            rolconsola.setParameter("NombreFeria", entidad.getNombreFeria());
            rolconsola.setParameter("ImagenPdf", entidad.getImagenPdf());
            rolconsola.execute();
            return JSONObject.quote((String) rolconsola.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCRuedaNegocioMod actualiza");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

    @Override
    public String ActualizarReubicaRN(CRuedaNegocioModEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("paCReubicaRN");
            rolconsola.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdRueda", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("FechaInicioN", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("FechaFinN", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Motivo", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdUsuario", Integer.class, ParameterMode.IN);
            rolconsola.setParameter("Bandera", Bandera);
            rolconsola.setParameter("IdRueda", entidad.getIdRuedaNegocio());
            rolconsola.setParameter("FechaInicioN", entidad.getFechaInicioRdn());
            rolconsola.setParameter("FechaFinN", entidad.getFechaFinRdn());
            rolconsola.setParameter("Motivo", entidad.getMotivo());
            rolconsola.setParameter("IdUsuario", entidad.getIdUsuarioC());            
            rolconsola.execute();
            return JSONObject.quote((String) rolconsola.getOutputParameterValue("respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCReubicaRN inserta y actualiza");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

}
