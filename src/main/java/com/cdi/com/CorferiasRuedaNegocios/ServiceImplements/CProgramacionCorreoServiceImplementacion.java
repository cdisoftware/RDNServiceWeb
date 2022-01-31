package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CProgramacionCorreoEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.CProgramacionCorreoService;
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
public class CProgramacionCorreoServiceImplementacion implements CProgramacionCorreoService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public List<CProgramacionCorreoEntity> ConsultaProgramacionCorreo(CProgramacionCorreoEntity entidad, Integer Bandera,
            String Idioma, Integer IdRueda, Integer IdPlantilla, Integer IdPerfil, Integer IdPais, String Departamento, String Ciudad,
            Integer IdEnvio, Integer IdParticipante) {
        try {
            StoredProcedureQuery permisos = repositorio.createNamedStoredProcedureQuery("paCProgramacionCorreo");
            permisos.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdRueda", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdPlantilla", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdPerfil", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("FechaEnvio", String.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdPais", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("Departamento", String.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("Ciudad", String.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdEnvio", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdParticipante", Integer.class, ParameterMode.IN);
            permisos.setParameter("Bandera", Bandera);
            permisos.setParameter("Idioma", Idioma);
            permisos.setParameter("IdRueda", IdRueda);
            permisos.setParameter("IdPlantilla", IdPlantilla);
            permisos.setParameter("IdPerfil", IdPerfil);
            permisos.setParameter("FechaEnvio", entidad.getFechaEnvio());
            permisos.setParameter("IdPais", IdPais);
            permisos.setParameter("Departamento", Departamento);
            permisos.setParameter("Ciudad", Ciudad);
            permisos.setParameter("IdEnvio", IdEnvio);
            permisos.setParameter("IdParticipante", IdParticipante);
            return permisos.getResultList();
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCProgramacionCorreo");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

    @Override
    public String InsertarProgramacionCorreo(CProgramacionCorreoEntity entidad, 
            Integer Bandera, String Idioma, Integer IdUsuarioC) {
        try {
            StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("paCProgramacionCorreoMod");
            rolconsola.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdRueda", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdPlantilla", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdPerfil", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("FechaEnvio", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdPais", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Departamento", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Ciudad", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdEnvio", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TipoEnvio", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("HoraEnvio", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("NombreEmpresa", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Nit", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("EstadoParticipante", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdParticipante", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdUsuarioC", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("FechaRealEnvio", String.class, ParameterMode.IN);
            rolconsola.setParameter("Bandera", Bandera);
            rolconsola.setParameter("Idioma", Idioma);
            rolconsola.setParameter("IdRueda", entidad.getIdRuedaNegocio());
            rolconsola.setParameter("IdPlantilla", entidad.getIdPlantilla());
            rolconsola.setParameter("IdPerfil", entidad.getIdPerfilRueda());
            rolconsola.setParameter("FechaEnvio", entidad.getFechaEnvio());
            rolconsola.setParameter("IdPais", entidad.getIdPais());
            rolconsola.setParameter("Departamento", entidad.getIdDepartamento());
            rolconsola.setParameter("Ciudad", entidad.getIdCiudad());
            rolconsola.setParameter("IdEnvio", entidad.getIdEnvioCorreo());
            rolconsola.setParameter("TipoEnvio", entidad.getIdTipoEnvio());
            rolconsola.setParameter("HoraEnvio", entidad.getHoraEnvio());
            rolconsola.setParameter("NombreEmpresa", entidad.getNombreEmpresa());
            rolconsola.setParameter("Nit", entidad.getIdentificacion());
            rolconsola.setParameter("EstadoParticipante", entidad.getEstadoParticipante());
            rolconsola.setParameter("IdParticipante", entidad.getIdParticipante());
            rolconsola.setParameter("IdUsuarioC", IdUsuarioC);
            rolconsola.setParameter("FechaRealEnvio", entidad.getFechaHoraRealEnvio());
            rolconsola.execute();
            return JSONObject.quote((String) rolconsola.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCProgramacionCorreoMod insertar");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

    @Override
    public String ActualizarProgramacionCorreo(CProgramacionCorreoEntity entidad, Integer Bandera, String Idioma, Integer IdUsuarioC) {
                try {
            StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("paCProgramacionCorreoMod");
            rolconsola.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdRueda", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdPlantilla", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdPerfil", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("FechaEnvio", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdPais", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Departamento", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Ciudad", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdEnvio", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TipoEnvio", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("HoraEnvio", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("NombreEmpresa", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Nit", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("EstadoParticipante", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdParticipante", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdUsuarioC", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("FechaRealEnvio", String.class, ParameterMode.IN);
            rolconsola.setParameter("Bandera", Bandera);
            rolconsola.setParameter("Idioma", Idioma);
            rolconsola.setParameter("IdRueda", entidad.getIdRuedaNegocio());
            rolconsola.setParameter("IdPlantilla", entidad.getIdPlantilla());
            rolconsola.setParameter("IdPerfil", entidad.getIdPerfilRueda());
            rolconsola.setParameter("FechaEnvio", entidad.getFechaEnvio());
            rolconsola.setParameter("IdPais", entidad.getIdPais());
            rolconsola.setParameter("Departamento", entidad.getIdDepartamento());
            rolconsola.setParameter("Ciudad", entidad.getIdCiudad());
            rolconsola.setParameter("IdEnvio", entidad.getIdEnvioCorreo());
            rolconsola.setParameter("TipoEnvio", entidad.getIdTipoEnvio());
            rolconsola.setParameter("HoraEnvio", entidad.getHoraEnvio());
            rolconsola.setParameter("NombreEmpresa", entidad.getNombreEmpresa());
            rolconsola.setParameter("Nit", entidad.getIdentificacion());
            rolconsola.setParameter("EstadoParticipante", entidad.getEstadoParticipante());
            rolconsola.setParameter("IdParticipante", entidad.getIdParticipante());
            rolconsola.setParameter("IdUsuarioC", IdUsuarioC);
            rolconsola.setParameter("FechaRealEnvio", entidad.getFechaHoraRealEnvio());
            rolconsola.execute();
            return JSONObject.quote((String) rolconsola.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCProgramacionCorreoMod actualizar");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

}
