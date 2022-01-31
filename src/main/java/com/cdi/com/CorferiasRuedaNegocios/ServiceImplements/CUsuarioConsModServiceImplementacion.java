package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Comun.clsEncriptacion;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CUsuarioConsModEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.CUsuarioConsModService;
import com.cdi.com.CorferiasRuedaNegocios.Services.LogConsolaService;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CUsuarioConsModServiceImplementacion implements CUsuarioConsModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public List<CUsuarioConsModEntity> ConsultaUsuarioConsola(Integer Bandera, Integer Idusuario, Integer Estado, Integer IdRol, Integer IdUsuarioCons, String NombreUsuario) {
        try {
            StoredProcedureQuery usucons = repositorio.createNamedStoredProcedureQuery("paCUsuarioConsulta");
            usucons.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            usucons.registerStoredProcedureParameter("Idusuario", Integer.class, ParameterMode.IN);
            usucons.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            usucons.registerStoredProcedureParameter("IdRol", Integer.class, ParameterMode.IN);
            usucons.registerStoredProcedureParameter("IdUsuarioCons", Integer.class, ParameterMode.IN);
            usucons.registerStoredProcedureParameter("NombreUsuario", String.class, ParameterMode.IN);
            usucons.setParameter("Bandera", Bandera);
            usucons.setParameter("Idusuario", Idusuario);
            usucons.setParameter("Estado", Estado);
            usucons.setParameter("IdRol", IdRol);
            usucons.setParameter("IdUsuarioCons", IdUsuarioCons);
            usucons.setParameter("NombreUsuario", NombreUsuario);
            return usucons.getResultList();
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCUsuarioConsulta");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

    @Override
    public String InsertarUsuarioConsMod(CUsuarioConsModEntity entidad, Integer Bandera, Integer Idusuario) {
        try {
            StoredProcedureQuery usucons = repositorio.createNamedStoredProcedureQuery("paCUsuarioConsMod");
            usucons.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            usucons.registerStoredProcedureParameter("Idusuario", Integer.class, ParameterMode.IN);
            usucons.registerStoredProcedureParameter("TipoId", Integer.class, ParameterMode.IN);
            usucons.registerStoredProcedureParameter("NroId", String.class, ParameterMode.IN);
            usucons.registerStoredProcedureParameter("Usuario", String.class, ParameterMode.IN);
            usucons.registerStoredProcedureParameter("Nombre", String.class, ParameterMode.IN);
            usucons.registerStoredProcedureParameter("Apellido", String.class, ParameterMode.IN);
            usucons.registerStoredProcedureParameter("Email", String.class, ParameterMode.IN);
            usucons.registerStoredProcedureParameter("Area", String.class, ParameterMode.IN);
            usucons.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            usucons.registerStoredProcedureParameter("IdUsuarioC", Integer.class, ParameterMode.IN);
            usucons.registerStoredProcedureParameter("Clave", String.class, ParameterMode.IN);
            usucons.registerStoredProcedureParameter("Directorio", Integer.class, ParameterMode.IN);
            usucons.setParameter("Bandera", Bandera);
            usucons.setParameter("Idusuario", Idusuario);
            usucons.setParameter("TipoId", entidad.getIdIdentificacion());
            usucons.setParameter("NroId", entidad.getIdentificacion());
            usucons.setParameter("Usuario", entidad.getUsuario());
            usucons.setParameter("Nombre", entidad.getNombre());
            usucons.setParameter("Apellido", entidad.getApellido());
            usucons.setParameter("Email", entidad.getEmail());
            usucons.setParameter("Area", entidad.getArea());
            usucons.setParameter("Estado", entidad.getEstado());
            usucons.setParameter("IdUsuarioC", entidad.getIdUsuarioC());
            try {
                usucons.setParameter("Clave", clsEncriptacion.Encriptar(entidad.getClave()));
            } catch (IllegalBlockSizeException | NoSuchPaddingException | BadPaddingException ex) {
                LogConsolaEntity entidadLog = new LogConsolaEntity();
                entidadLog.setCodigo(String.valueOf(ex.hashCode()));
                entidadLog.setMensaje(ex.getMessage());
                entidadLog.setServicio("ERROR SERVICIO DE ENCRIPTACION");
                entidadLog.setTipo(1);
                service.InsertaLog(entidadLog);
                return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
            }
            usucons.setParameter("Directorio", entidad.getDirectorioActivo());
            usucons.execute();
            return JSONObject.quote((String) usucons.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCUsuarioConsMod insertar");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

    @Override
    public String ActualizarUsuarioConsMod(CUsuarioConsModEntity entidad, Integer Bandera, Integer Idusuario) {

        try {
            StoredProcedureQuery usucons = repositorio.createNamedStoredProcedureQuery("paCUsuarioConsMod");
            usucons.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            usucons.registerStoredProcedureParameter("Idusuario", Integer.class, ParameterMode.IN);
            usucons.registerStoredProcedureParameter("TipoId", Integer.class, ParameterMode.IN);
            usucons.registerStoredProcedureParameter("NroId", String.class, ParameterMode.IN);
            usucons.registerStoredProcedureParameter("Usuario", String.class, ParameterMode.IN);
            usucons.registerStoredProcedureParameter("Nombre", String.class, ParameterMode.IN);
            usucons.registerStoredProcedureParameter("Apellido", String.class, ParameterMode.IN);
            usucons.registerStoredProcedureParameter("Email", String.class, ParameterMode.IN);
            usucons.registerStoredProcedureParameter("Area", String.class, ParameterMode.IN);
            usucons.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            usucons.registerStoredProcedureParameter("IdUsuarioC", Integer.class, ParameterMode.IN);
            usucons.registerStoredProcedureParameter("Clave", String.class, ParameterMode.IN);
            usucons.registerStoredProcedureParameter("Directorio", Integer.class, ParameterMode.IN);
            usucons.setParameter("Bandera", Bandera);
            usucons.setParameter("Idusuario", Idusuario);
            usucons.setParameter("TipoId", entidad.getIdIdentificacion());
            usucons.setParameter("NroId", entidad.getIdentificacion());
            usucons.setParameter("Usuario", entidad.getUsuario());
            usucons.setParameter("Nombre", entidad.getNombre());
            usucons.setParameter("Apellido", entidad.getApellido());
            usucons.setParameter("Email", entidad.getEmail());
            usucons.setParameter("Area", entidad.getArea());
            usucons.setParameter("Estado", entidad.getEstado());
            usucons.setParameter("IdUsuarioC", entidad.getIdUsuarioC());
            try {
                usucons.setParameter("Clave", clsEncriptacion.Encriptar(entidad.getClave()));
            } catch (IllegalBlockSizeException | NoSuchPaddingException | BadPaddingException ex) {
                LogConsolaEntity entidadLog = new LogConsolaEntity();
                entidadLog.setCodigo(String.valueOf(ex.hashCode()));
                entidadLog.setMensaje(ex.getMessage());
                entidadLog.setServicio("ERROR SERVICIO DE ENCRIPTACION");
                entidadLog.setTipo(1);
                service.InsertaLog(entidadLog);
                return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");

            }
            usucons.setParameter("Directorio", entidad.getDirectorioActivo());
            usucons.execute();
            return JSONObject.quote((String) usucons.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCUsuarioConsMod Actualizar");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

}
