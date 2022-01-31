package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.PProductosServiciosModEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.LogConsolaService;
import org.springframework.stereotype.Service;
import com.cdi.com.CorferiasRuedaNegocios.Services.PProductosServiciosModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class PProductosServiciosModServiceImplementacion implements PProductosServiciosModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public String InsertarProductosServicios(PProductosServiciosModEntity entidad, Integer Bandera, String Idioma) {
        try {
            StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("paPProductosServiciosMod");
            rolconsola.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdParticipante", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("NombreProducto", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("DescripcionProducto", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("FichaTecnica", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Imagen", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdUsuarioC", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdProducto", Integer.class, ParameterMode.IN);
            rolconsola.setParameter("Bandera", Bandera);
            rolconsola.setParameter("IdParticipante", entidad.getIdParticipante());
            rolconsola.setParameter("Idioma", Idioma);
            rolconsola.setParameter("NombreProducto", entidad.getNombreProducto());
            rolconsola.setParameter("DescripcionProducto", entidad.getDescripcionProducto());
            rolconsola.setParameter("FichaTecnica", entidad.getFichaTecnica());
            rolconsola.setParameter("Imagen", entidad.getImagen());
            rolconsola.setParameter("Estado", entidad.getEstado());
            rolconsola.setParameter("IdUsuarioC", entidad.getIdUsuarioC());
            rolconsola.setParameter("IdProducto", entidad.getIdProducto());
            rolconsola.execute();
            return JSONObject.quote((String) rolconsola.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paPProductosServiciosMod insertar");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

    @Override
    public String ActualizarProductosServicios(PProductosServiciosModEntity entidad, Integer Bandera, String Idioma) {
           try {
            StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("paPProductosServiciosMod");
            rolconsola.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdParticipante", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("NombreProducto", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("DescripcionProducto", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("FichaTecnica", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Imagen", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdUsuarioC", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdProducto", Integer.class, ParameterMode.IN);
            rolconsola.setParameter("Bandera", Bandera);
            rolconsola.setParameter("IdParticipante", entidad.getIdParticipante());
            rolconsola.setParameter("Idioma", Idioma);
            rolconsola.setParameter("NombreProducto", entidad.getNombreProducto());
            rolconsola.setParameter("DescripcionProducto", entidad.getDescripcionProducto());
            rolconsola.setParameter("FichaTecnica", entidad.getFichaTecnica());
            rolconsola.setParameter("Imagen", entidad.getImagen());
            rolconsola.setParameter("Estado", entidad.getEstado());
            rolconsola.setParameter("IdUsuarioC", entidad.getIdUsuarioC());
            rolconsola.setParameter("IdProducto", entidad.getIdProducto());
            rolconsola.execute();
            return JSONObject.quote((String) rolconsola.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paPProductosServiciosMod actualizar");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

}
