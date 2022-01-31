package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CPlantillaCorreoEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.CPlantillaCorreoService;
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
public class CPlantillaCorreoServiceImplementacion implements CPlantillaCorreoService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public List<CPlantillaCorreoEntity> ConsultaPlantillaCorreo(Integer bandera, String Idioma, 
            String NombrePlantilla, Integer IdTipoPlantilla, Integer MomentoEnvio, 
            String Asunto, String EmailRemite, Integer Estado, String Descripcion, Integer IdPlantilla, Integer IdModuloEstado) {
        try {
            StoredProcedureQuery permisos = repositorio.createNamedStoredProcedureQuery("paCPlantillaCorreo");
            permisos.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("NombrePlantilla", String.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdTipoPlantilla", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("MomentoEnvio", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("Asunto", String.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("EmailRemite", String.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("Descripcion", String.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdPlantilla", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdModuloEstado", Integer.class, ParameterMode.IN);
            permisos.setParameter("bandera", bandera);
            permisos.setParameter("Idioma", Idioma);
            permisos.setParameter("NombrePlantilla", NombrePlantilla);
            permisos.setParameter("IdTipoPlantilla", IdTipoPlantilla);
            permisos.setParameter("MomentoEnvio", MomentoEnvio);
            permisos.setParameter("Asunto", Asunto);
            permisos.setParameter("EmailRemite", EmailRemite);
            permisos.setParameter("Estado", Estado);
            permisos.setParameter("Descripcion", Descripcion);
            permisos.setParameter("IdPlantilla", IdPlantilla);
            permisos.setParameter("IdModuloEstado", IdModuloEstado);
            return permisos.getResultList();
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCPlantillaCorreo");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

    @Override
    public String InsertarPlantillaCorreo(CPlantillaCorreoEntity entidad, Integer bandera, String Idioma, Integer IdUsuarioC) {
        try {
            StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("paCPlantillaCorreoMod");
            rolconsola.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdUsuarioC", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdPlantilla", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("NombrePlantilla", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdTipoPlantilla", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("MomentoEnvio", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Asunto", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("EmailRemite", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Descripcion", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("ImagenEnc", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("ImagenPie", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdModuloEstado", Integer.class, ParameterMode.IN);
            rolconsola.setParameter("bandera", bandera);
            rolconsola.setParameter("Idioma", Idioma);
            rolconsola.setParameter("IdUsuarioC", IdUsuarioC);
            rolconsola.setParameter("IdPlantilla", entidad.getIdPlantilla());
            rolconsola.setParameter("NombrePlantilla", entidad.getNombrePlantilla());
            rolconsola.setParameter("IdTipoPlantilla", entidad.getIdTipoPlantilla());
            rolconsola.setParameter("MomentoEnvio", entidad.getMomentoEnvio());
            rolconsola.setParameter("Asunto", entidad.getAsunto());
            rolconsola.setParameter("EmailRemite", entidad.getEmailRemite());
            rolconsola.setParameter("Estado", entidad.getEstado());
            rolconsola.setParameter("Descripcion", entidad.getDescripcion());
            rolconsola.setParameter("ImagenEnc", entidad.getImagenEnc());
            rolconsola.setParameter("ImagenPie", entidad.getImagenPie());
            rolconsola.setParameter("IdModuloEstado", entidad.getIdModuloEstado());
            rolconsola.execute();
            return JSONObject.quote((String) rolconsola.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCPlantillaCorreoMod insertar");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

    @Override
    public String ActualizarPlantillaCorreo(CPlantillaCorreoEntity entidad, Integer bandera, String Idioma, Integer IdUsuarioC) {
          try {
         StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("paCPlantillaCorreoMod");
            rolconsola.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdUsuarioC", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdPlantilla", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("NombrePlantilla", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdTipoPlantilla", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("MomentoEnvio", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Asunto", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("EmailRemite", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Descripcion", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("ImagenEnc", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("ImagenPie", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdModuloEstado", Integer.class, ParameterMode.IN);
            rolconsola.setParameter("bandera", bandera);
            rolconsola.setParameter("Idioma", Idioma);
            rolconsola.setParameter("IdUsuarioC", IdUsuarioC);
            rolconsola.setParameter("IdPlantilla", entidad.getIdPlantilla());
            rolconsola.setParameter("NombrePlantilla", entidad.getNombrePlantilla());
            rolconsola.setParameter("IdTipoPlantilla", entidad.getIdTipoPlantilla());
            rolconsola.setParameter("MomentoEnvio", entidad.getMomentoEnvio());
            rolconsola.setParameter("Asunto", entidad.getAsunto());
            rolconsola.setParameter("EmailRemite", entidad.getEmailRemite());
            rolconsola.setParameter("Estado", entidad.getEstado());
            rolconsola.setParameter("Descripcion", entidad.getDescripcion());
            rolconsola.setParameter("ImagenEnc", entidad.getImagenEnc());
            rolconsola.setParameter("ImagenPie", entidad.getImagenPie());
            rolconsola.setParameter("IdModuloEstado", entidad.getIdModuloEstado());
            rolconsola.execute();
            return JSONObject.quote((String) rolconsola.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCPlantillaCorreoMod actualizar");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

}
