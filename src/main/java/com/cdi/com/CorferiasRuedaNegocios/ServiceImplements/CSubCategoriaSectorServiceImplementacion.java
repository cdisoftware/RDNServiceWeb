package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CSubCategoriaSectorEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.CSubCategoriaSectorService;
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
public class CSubCategoriaSectorServiceImplementacion implements CSubCategoriaSectorService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public List<CSubCategoriaSectorEntity> CSubConsultaSubCategoriaSector(Integer Bandera,
            String Idioma, Integer IdCategoria, Integer IdSubCategoria, String NombreSubCategoria) {
        try {
            StoredProcedureQuery permisos = repositorio.createNamedStoredProcedureQuery("paCSubCategoriaSector");
            permisos.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdCategoria", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdSubCategoria", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("NombreSubCategoria", String.class, ParameterMode.IN);
            permisos.setParameter("Bandera", Bandera);
            permisos.setParameter("Idioma", Idioma);
            permisos.setParameter("IdCategoria", IdCategoria);
            permisos.setParameter("IdSubCategoria", IdSubCategoria);
            permisos.setParameter("NombreSubCategoria", NombreSubCategoria);
            return permisos.getResultList();
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCSubCategoriaSector");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

    @Override
    public String CSubInsertarSubCategoriaSector(CSubCategoriaSectorEntity entidad,
            Integer Bandera, String Idioma) {
        try {
            StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("paCSubCategoriaSectorMod");
            rolconsola.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdUsuario", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdCategoria", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdSubCategoria", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("NombreSubCategoria", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            rolconsola.setParameter("Bandera", Bandera);
            rolconsola.setParameter("Idioma", Idioma);
            rolconsola.setParameter("IdUsuario", entidad.getIdUsuarioC());
            rolconsola.setParameter("IdCategoria", entidad.getIdCategoria());
            rolconsola.setParameter("IdSubCategoria", entidad.getIdSubcategoria());
            rolconsola.setParameter("NombreSubCategoria", entidad.getNombreSubcategoria());
            rolconsola.setParameter("Estado", entidad.getEstado());
            rolconsola.execute();
            return JSONObject.quote((String) rolconsola.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCSubCategoriaSectorMod insertar");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

    @Override
    public String CSubActualizarSubCategoriaSector(CSubCategoriaSectorEntity entidad, Integer Bandera, String Idioma) {
        try {
            StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("paCSubCategoriaSectorMod");
            rolconsola.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdUsuario", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdCategoria", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdSubCategoria", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("NombreSubCategoria", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            rolconsola.setParameter("Bandera", Bandera);
            rolconsola.setParameter("Idioma", Idioma);
            rolconsola.setParameter("IdUsuario", entidad.getIdUsuarioC());
            rolconsola.setParameter("IdCategoria", entidad.getIdCategoria());
            rolconsola.setParameter("IdSubCategoria", entidad.getIdSubcategoria());
            rolconsola.setParameter("NombreSubCategoria", entidad.getNombreSubcategoria());
            rolconsola.setParameter("Estado", entidad.getEstado());
            rolconsola.execute();
            return JSONObject.quote((String) rolconsola.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCSubCategoriaSectorMod actualizar");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }
}
