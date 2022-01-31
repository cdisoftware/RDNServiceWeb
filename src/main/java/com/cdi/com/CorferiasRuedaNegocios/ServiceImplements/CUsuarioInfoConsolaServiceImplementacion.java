package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Comun.clsEncriptacion;
import com.cdi.com.CorferiasRuedaNegocios.Entity.CUsuarioInfoConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.EncriptacionEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.LogConsolaService;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
import com.cdi.com.CorferiasRuedaNegocios.Services.CUsuarioInfoConsolaService;

@Service
public class CUsuarioInfoConsolaServiceImplementacion implements CUsuarioInfoConsolaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public String ConsultaUsuarioInfo(CUsuarioInfoConsolaEntity entity) {
        try {
            StoredProcedureQuery usuarioConsola = repositorio.createNamedStoredProcedureQuery("paCUsuarioInfoConsola");
            usuarioConsola.registerStoredProcedureParameter("Usuario", String.class, ParameterMode.IN);
            usuarioConsola.registerStoredProcedureParameter("Acceso", String.class, ParameterMode.IN);
            usuarioConsola.setParameter("Usuario", entity.getUsuario());
            try {
                usuarioConsola.setParameter("Acceso", clsEncriptacion.Encriptar(entity.getClave()));
            } catch (IllegalBlockSizeException | NoSuchPaddingException | BadPaddingException ex) {
            }

            List<CUsuarioInfoConsolaEntity> con = usuarioConsola.getResultList();
            String ResFinal;
            String id = null;
            String IdUsuarioC = null;
            String Identificacion = null;
            String IdIdentificacion = null;
            String Usuario = null;
            String Nombre = null;
            String Apellido = null;
            String Email = null;
            String Area = null;
            String IdRol = null;
            String Estado = null;
            String Clave = null;
            String FechaCreacion = null;
            String FechaMod = null;

            String[] terminos = new String[con.size()];
            for (int i = 0; i < con.size(); i++) {
                id = con.get(i).getID().toString();
                IdUsuarioC = con.get(i).getIdUsuarioC().toString();
                Identificacion = con.get(i).getIdentificacion();
                IdIdentificacion = con.get(i).getIdIdentificacion().toString();
                Usuario = con.get(i).getUsuario();
                Nombre = con.get(i).getNombre();
                Apellido = con.get(i).getApellido();
                Email = con.get(i).getEmail();
                Area = con.get(i).getArea();
                IdRol = con.get(i).getIdRol().toString();
                Estado = con.get(i).getEstado().toString();
                Clave = clsEncriptacion.Desencriptar(con.get(i).getClave());
                FechaCreacion = con.get(i).getFechaCreacion();
                FechaMod = con.get(i).getFechaMod();
            }
            ResFinal
                    = "[{\"ID\":\"" + id + "\","
                    + "\"IdUsuarioC\":\"" + IdUsuarioC + "\","
                    + "\"Identificacion\":\"" + Identificacion + "\","
                    + "\"IdIdentificacion\":\"" + IdIdentificacion + "\","
                    + "\"Usuario\":\"" + Usuario + "\","
                    + "\"Nombre\":\"" + Nombre + "\","
                    + "\"Apellido\":\"" + Apellido + "\","
                    + "\"Email\":\"" + Email + "\","
                    + "\"Area\":\"" + Area + "\","
                    + "\"IdRol\":\"" + IdRol + "\","
                    + "\"Estado\":\"" + Estado + "\","
                    + "\"Clave\":\"" + Clave + "\","
                    + "\"FechaCreacion\":\"" + FechaCreacion + "\","
                    + "\"FechaMod\":\"" + FechaMod + "\"}]";
            return ResFinal;
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCConsultaUsuarioInfoConsola");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

    @Override
    public String Clave(EncriptacionEntity entidad) {
        String Respuesta = null;

        if (entidad.getBandera() == 1) {
            try {
                String encripta = clsEncriptacion.Encriptar(entidad.getClave());
                Respuesta = encripta;
            } catch (IllegalBlockSizeException | NoSuchPaddingException | BadPaddingException ex) {
                Logger.getLogger(CUsuarioInfoConsolaServiceImplementacion.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            String desencripta = clsEncriptacion.Desencriptar(entidad.getClave());
            Respuesta = desencripta;
        }
        return JSONObject.quote(Respuesta);
    }

    @Override
    public String InsertarRelUsuarioRol(CUsuarioInfoConsolaEntity entity, Integer Bandera, Integer IdUsuario) {
         try {
            StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("paCUsuarioRolModifica");
            rolconsola.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdUsuarioRol", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdUsuario", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdRol", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            rolconsola.setParameter("Bandera", Bandera);
            rolconsola.setParameter("IdUsuarioRol", entity.getIdUsuarioC());
            rolconsola.setParameter("IdUsuario", IdUsuario);
            rolconsola.setParameter("IdRol", entity.getIdRol());
            rolconsola.setParameter("Estado", entity.getEstado());
            rolconsola.execute();
            return JSONObject.quote((String) rolconsola.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCUsuarioRolModifica insertar");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

    @Override
    public String ActualizarRelUsuarioRol(CUsuarioInfoConsolaEntity entity, Integer Bandera, Integer IdUsuario) {
          try {
            StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("paCUsuarioRolModifica");
            rolconsola.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdUsuarioRol", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdUsuario", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdRol", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            rolconsola.setParameter("Bandera", Bandera);
            rolconsola.setParameter("IdUsuarioRol", entity.getIdUsuarioC());
            rolconsola.setParameter("IdUsuario", IdUsuario);
            rolconsola.setParameter("IdRol", entity.getIdRol());
            rolconsola.setParameter("Estado", entity.getEstado());
            rolconsola.execute();
            return JSONObject.quote((String) rolconsola.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCUsuarioRolModifica actualizar");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }
}
