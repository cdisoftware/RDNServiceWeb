package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CPermisosRolEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.CPermisosRolService;
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
public class CPermisosRolServiceImplementacion implements CPermisosRolService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public List<CPermisosRolEntity> ConsultaPermisosRol(Integer bandera, Integer IdRol, String NombreRol) {
        try {
            StoredProcedureQuery permisos = repositorio.createNamedStoredProcedureQuery("paCPermisosRol");
            permisos.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdRol", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("NombreRol", String.class, ParameterMode.IN);
            permisos.setParameter("bandera", bandera);
            permisos.setParameter("IdRol", IdRol);
            permisos.setParameter("NombreRol", NombreRol);
            return permisos.getResultList();
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCPermisosRol");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

    @Override
    public String InsertarPermisosRolConsola(CPermisosRolEntity entidad, Integer Bandera, Integer IdUsuario) {
           try {
            StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("paCPermisosRolMod");
            rolconsola.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdModulo", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdRol", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdUsuario", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            rolconsola.setParameter("Bandera", Bandera);
            rolconsola.setParameter("IdModulo", entidad.getIdModulo());
            rolconsola.setParameter("IdRol", entidad.getIdRol());
            rolconsola.setParameter("IdUsuario", IdUsuario);
            rolconsola.setParameter("Estado", entidad.getEstado());
            rolconsola.execute();
            return JSONObject.quote((String) rolconsola.getOutputParameterValue("respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCPermisosRolMod insertar");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

    @Override
    public String ActualizarPermisosRolConsola(CPermisosRolEntity entidad, Integer Bandera, Integer IdUsuario) {
          try {
            StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("paCPermisosRolMod");
            rolconsola.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdModulo", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdRol", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdUsuario", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            rolconsola.setParameter("Bandera", Bandera);
            rolconsola.setParameter("IdModulo", entidad.getIdModulo());
            rolconsola.setParameter("IdRol", entidad.getIdRol());
            rolconsola.setParameter("IdUsuario", IdUsuario);
            rolconsola.setParameter("Estado", entidad.getEstado());
            rolconsola.execute();
            return JSONObject.quote((String) rolconsola.getOutputParameterValue("respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCPermisosRolMod actualizar");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

}
