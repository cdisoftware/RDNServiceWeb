package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CRelDocEnvioCorreoModEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.CRelDocEnvioCorreoModService;
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
public class CRelDocEnvioCorreoModServiceImplementacion implements CRelDocEnvioCorreoModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public String InsertarRelacionEnvioCorreoMod(CRelDocEnvioCorreoModEntity entidad, Integer Bandera, String Idioma) {
        try {
            StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("paCRelDocEnvioCorreoMod");
            rolconsola.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdEnvioCorreo", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Documento", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Id", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Path", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            rolconsola.setParameter("Bandera", Bandera);
            rolconsola.setParameter("IdEnvioCorreo", entidad.getIdPlantilla());
            rolconsola.setParameter("Documento", entidad.getDocumento());
            rolconsola.setParameter("Id", entidad.getId());       
            rolconsola.setParameter("Path", entidad.getPath());
            rolconsola.setParameter("Idioma", Idioma);
            rolconsola.execute();
            return JSONObject.quote((String) rolconsola.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCRelDocEnvioCorreoMod insertar");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

    @Override
    public String EliminarRelacionEnvioCorreoMod(CRelDocEnvioCorreoModEntity entidad, Integer Bandera, String Idioma) {
         try {
            StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("paCRelDocEnvioCorreoMod");
            rolconsola.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdEnvioCorreo", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Documento", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Id", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Path", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            rolconsola.setParameter("Bandera", Bandera);
            rolconsola.setParameter("IdEnvioCorreo", entidad.getIdPlantilla());
            rolconsola.setParameter("Documento", entidad.getDocumento());
            rolconsola.setParameter("Id", entidad.getId()); 
            rolconsola.setParameter("Path", entidad.getPath()); 
            rolconsola.setParameter("Idioma", Idioma);
            rolconsola.execute();
            return JSONObject.quote((String) rolconsola.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCRelDocEnvioCorreoMod eliminar");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

    @Override
    public List<CRelDocEnvioCorreoModEntity> ConsultaRelacionDocEnvioCorreo(Integer Bandera, 
            Integer IdPlantilla, String Documento, Integer Id, String Idioma) {
           try {
            StoredProcedureQuery permisos = repositorio.createNamedStoredProcedureQuery("paCRelDocPlantillaCorreo");
            permisos.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdPlantilla", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("Documento", String.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("Id", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            permisos.setParameter("Bandera", Bandera);
            permisos.setParameter("IdPlantilla", IdPlantilla);
            permisos.setParameter("Documento", Documento);
            permisos.setParameter("Id", Id);
            permisos.setParameter("Idioma", Idioma);
            return permisos.getResultList();
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCRelDocPlantillaCorreo");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
