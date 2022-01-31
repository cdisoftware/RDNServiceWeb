package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CCamposParticipanteEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.CCamposParticipanteService;
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
public class CCamposParticipanteServiceImplementacion implements CCamposParticipanteService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public List<CCamposParticipanteEntity> ConsultaCamposParticipante(Integer Bandera, Integer IdRdn) {
        try {
            StoredProcedureQuery permisos = repositorio.createNamedStoredProcedureQuery("paCCamposParticipante");
            permisos.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdRdn", Integer.class, ParameterMode.IN);
            permisos.setParameter("Bandera", Bandera);
            permisos.setParameter("IdRdn", IdRdn);
            return permisos.getResultList();
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCCamposParticipante");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

    @Override
    public String InsertarCamposParticipante(CCamposParticipanteEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("paCCamposParticipanteMod");
            rolconsola.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdRdn", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdUsuarioC", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("DepartamentoEmpresa", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("CiudadEmpresa", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TelefonoEmpresa", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("DireccionEmpresa", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("PalabrasEmpresa", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("UrlEmpresa", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TelefonoContacto", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("GeneroContacto", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("CorreoOpcional", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdCampo", Integer.class, ParameterMode.IN);
            rolconsola.setParameter("Bandera", Bandera);
            rolconsola.setParameter("IdRdn", entidad.getIdRuedaNegocio());
            rolconsola.setParameter("IdUsuarioC", entidad.getIdUsuarioC());
            rolconsola.setParameter("DepartamentoEmpresa", entidad.getDepartamentoEmpresa());
            rolconsola.setParameter("CiudadEmpresa", entidad.getCiudadEmpresa());
            rolconsola.setParameter("TelefonoEmpresa", entidad.getTelefonoEmpresa());
            rolconsola.setParameter("DireccionEmpresa", entidad.getDireccionEmpresa());
            rolconsola.setParameter("PalabrasEmpresa", entidad.getPalabrasEmpresa());
            rolconsola.setParameter("UrlEmpresa", entidad.getUrlEmpresa());
            rolconsola.setParameter("TelefonoContacto", entidad.getTelefonoContacto());
            rolconsola.setParameter("GeneroContacto", entidad.getGeneroContacto());
            rolconsola.setParameter("CorreoOpcional", entidad.getCorreoOpcional());
            rolconsola.setParameter("IdCampo", entidad.getIdCampo());
            rolconsola.execute();
            return JSONObject.quote((String) rolconsola.getOutputParameterValue("respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCCamposParticipanteMod insertar");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

    @Override
    public String ActualizarCamposParticipante(CCamposParticipanteEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("paCCamposParticipanteMod");
            rolconsola.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdRdn", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdUsuarioC", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("DepartamentoEmpresa", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("CiudadEmpresa", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TelefonoEmpresa", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("DireccionEmpresa", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("PalabrasEmpresa", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("UrlEmpresa", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TelefonoContacto", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("GeneroContacto", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("CorreoOpcional", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdCampo", Integer.class, ParameterMode.IN);
            rolconsola.setParameter("Bandera", Bandera);
            rolconsola.setParameter("IdRdn", entidad.getIdRuedaNegocio());
            rolconsola.setParameter("IdUsuarioC", entidad.getIdUsuarioC());
            rolconsola.setParameter("DepartamentoEmpresa", entidad.getDepartamentoEmpresa());
            rolconsola.setParameter("CiudadEmpresa", entidad.getCiudadEmpresa());
            rolconsola.setParameter("TelefonoEmpresa", entidad.getTelefonoEmpresa());
            rolconsola.setParameter("DireccionEmpresa", entidad.getDireccionEmpresa());
            rolconsola.setParameter("PalabrasEmpresa", entidad.getPalabrasEmpresa());
            rolconsola.setParameter("UrlEmpresa", entidad.getUrlEmpresa());
            rolconsola.setParameter("TelefonoContacto", entidad.getTelefonoContacto());
            rolconsola.setParameter("GeneroContacto", entidad.getGeneroContacto());
            rolconsola.setParameter("CorreoOpcional", entidad.getCorreoOpcional());
            rolconsola.setParameter("IdCampo", entidad.getIdCampo());
            rolconsola.execute();
            return JSONObject.quote((String) rolconsola.getOutputParameterValue("respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCCamposParticipanteMod actualizar");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

}
