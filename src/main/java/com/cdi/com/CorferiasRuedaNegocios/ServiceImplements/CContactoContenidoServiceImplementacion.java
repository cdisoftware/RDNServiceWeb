package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CContactoContenidoEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.CContactoContenidoService;
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
public class CContactoContenidoServiceImplementacion implements CContactoContenidoService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public List<CContactoContenidoEntity> ConsultaContactoContenido(Integer Bandera, Integer IdRueda) {
        try {
            StoredProcedureQuery permisos = repositorio.createNamedStoredProcedureQuery("paCContactoContenido");
            permisos.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdRueda", Integer.class, ParameterMode.IN);
            permisos.setParameter("Bandera", Bandera);
            permisos.setParameter("IdRueda", IdRueda);
            return permisos.getResultList();
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCContactoContenido");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

    @Override
    public String InsertarContactoContenido(CContactoContenidoEntity entidad, 
            Integer Bandera, String Idioma, Integer IdUsuarioC) {
        try {
            StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("paCContactoContenidoMod");
            rolconsola.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdRueda", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdUsuarioC", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("NombreContactoUno", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("EmailContactoUno", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("EncargadoUno", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TelefonosContactoUno", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("NombreContactoDos", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("EmailContactoDos", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("EncargadoDos", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TelefonosContactoDos", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("NombreContactoTres", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("EmailContactoTres", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("EncargadoTres", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TelefonosContactoTres", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("NombreContactoCuatro", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("EmailContactoCuatro", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("EncargadoCuatro", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TelefonosContactoCuatro", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("NombreContactoCinco", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("EmailContactoCinco", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("EncargadoCinco", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TelefonosContactoCinco", String.class, ParameterMode.IN);
            rolconsola.setParameter("Bandera", Bandera);
            rolconsola.setParameter("Idioma", Idioma);
            rolconsola.setParameter("IdRueda", entidad.getIdRuedaNegocio());
            rolconsola.setParameter("IdUsuarioC", IdUsuarioC);
            rolconsola.setParameter("NombreContactoUno", entidad.getNombreContactoUno());
            rolconsola.setParameter("EmailContactoUno", entidad.getEmailContactoUno());
            rolconsola.setParameter("EncargadoUno", entidad.getEncargadoUno());
            rolconsola.setParameter("TelefonosContactoUno", entidad.getTelefonosContactoUno());
            rolconsola.setParameter("NombreContactoDos", entidad.getNombreContactoDos());
            rolconsola.setParameter("EmailContactoDos", entidad.getEmailContactoDos());
            rolconsola.setParameter("EncargadoDos", entidad.getEncargadoDos());
            rolconsola.setParameter("TelefonosContactoDos", entidad.getTelefonosContactoDos());
            rolconsola.setParameter("NombreContactoTres", entidad.getNombreContactoTres());
            rolconsola.setParameter("EmailContactoTres", entidad.getEmailContactoTres());
            rolconsola.setParameter("EncargadoTres", entidad.getEncargadoTres());
            rolconsola.setParameter("TelefonosContactoTres", entidad.getTelefonosContactoTres());
            rolconsola.setParameter("NombreContactoCuatro", entidad.getNombreContactoCuatro());
            rolconsola.setParameter("EmailContactoCuatro", entidad.getEmailContactoCuatro());
            rolconsola.setParameter("EncargadoCuatro", entidad.getEncargadoCuatro());
            rolconsola.setParameter("TelefonosContactoCuatro", entidad.getTelefonosContactoCuatro());
            rolconsola.setParameter("NombreContactoCinco", entidad.getNombreContactoCinco());
            rolconsola.setParameter("EmailContactoCinco", entidad.getEmailContactoCinco());
            rolconsola.setParameter("EncargadoCinco", entidad.getEncargadoCinco());
            rolconsola.setParameter("TelefonosContactoCinco", entidad.getTelefonosContactoCinco());
            rolconsola.execute();
            return JSONObject.quote((String) rolconsola.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCContactoContenidoMod insertar");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

    @Override
    public String ActualizarContactoContenido(CContactoContenidoEntity entidad, Integer Bandera, String Idioma, Integer IdUsuarioC) {
        try {
            StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("paCContactoContenidoMod");
            rolconsola.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdRueda", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdUsuarioC", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("NombreContactoUno", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("EmailContactoUno", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("EncargadoUno", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TelefonosContactoUno", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("NombreContactoDos", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("EmailContactoDos", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("EncargadoDos", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TelefonosContactoDos", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("NombreContactoTres", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("EmailContactoTres", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("EncargadoTres", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TelefonosContactoTres", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("NombreContactoCuatro", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("EmailContactoCuatro", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("EncargadoCuatro", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TelefonosContactoCuatro", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("NombreContactoCinco", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("EmailContactoCinco", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("EncargadoCinco", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TelefonosContactoCinco", String.class, ParameterMode.IN);
            rolconsola.setParameter("Bandera", Bandera);
            rolconsola.setParameter("Idioma", Idioma);
            rolconsola.setParameter("IdRueda", entidad.getIdRuedaNegocio());
            rolconsola.setParameter("IdUsuarioC", IdUsuarioC);
            rolconsola.setParameter("NombreContactoUno", entidad.getNombreContactoUno());
            rolconsola.setParameter("EmailContactoUno", entidad.getEmailContactoUno());
            rolconsola.setParameter("EncargadoUno", entidad.getEncargadoUno());
            rolconsola.setParameter("TelefonosContactoUno", entidad.getTelefonosContactoUno());
            rolconsola.setParameter("NombreContactoDos", entidad.getNombreContactoDos());
            rolconsola.setParameter("EmailContactoDos", entidad.getEmailContactoDos());
            rolconsola.setParameter("EncargadoDos", entidad.getEncargadoDos());
            rolconsola.setParameter("TelefonosContactoDos", entidad.getTelefonosContactoDos());
            rolconsola.setParameter("NombreContactoTres", entidad.getNombreContactoTres());
            rolconsola.setParameter("EmailContactoTres", entidad.getEmailContactoTres());
            rolconsola.setParameter("EncargadoTres", entidad.getEncargadoTres());
            rolconsola.setParameter("TelefonosContactoTres", entidad.getTelefonosContactoTres());
            rolconsola.setParameter("NombreContactoCuatro", entidad.getNombreContactoCuatro());
            rolconsola.setParameter("EmailContactoCuatro", entidad.getEmailContactoCuatro());
            rolconsola.setParameter("EncargadoCuatro", entidad.getEncargadoCuatro());
            rolconsola.setParameter("TelefonosContactoCuatro", entidad.getTelefonosContactoCuatro());
            rolconsola.setParameter("NombreContactoCinco", entidad.getNombreContactoCinco());
            rolconsola.setParameter("EmailContactoCinco", entidad.getEmailContactoCinco());
            rolconsola.setParameter("EncargadoCinco", entidad.getEncargadoCinco());
            rolconsola.setParameter("TelefonosContactoCinco", entidad.getTelefonosContactoCinco());
            rolconsola.execute();
            return JSONObject.quote((String) rolconsola.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCContactoContenidoMod actualizar");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

}
