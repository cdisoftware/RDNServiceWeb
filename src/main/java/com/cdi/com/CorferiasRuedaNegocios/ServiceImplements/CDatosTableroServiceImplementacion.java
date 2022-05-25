package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CDatosTableroEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.CDatosTableroService;
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
public class CDatosTableroServiceImplementacion implements CDatosTableroService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public List<CDatosTableroEntity> ConsultaDatosTablero(Integer Bandera, 
            String NombreCaja, Integer IdGrupo, Integer IdCaja, Integer estado) {
        try {
            StoredProcedureQuery permisos = repositorio.createNamedStoredProcedureQuery("paCDatosTablero");
            permisos.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("NombreCaja", String.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdGrupo", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdCaja", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("estado", Integer.class, ParameterMode.IN);
            permisos.setParameter("Bandera", Bandera);
            permisos.setParameter("NombreCaja", NombreCaja);
            permisos.setParameter("IdGrupo", IdGrupo);
            permisos.setParameter("IdCaja", IdCaja);
            permisos.setParameter("estado", estado);
            return permisos.getResultList();
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getCause().getCause().getLocalizedMessage());
            entidadLog.setServicio("Servicio paCDatosTablero");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

    @Override
    public String InsertarDatosTablero(CDatosTableroEntity entidad, Integer Bandera, 
            Integer IdUsuarioC) {
          try {
            StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("paCDatosTableroMod");
            rolconsola.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("NombreCaja", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("sql", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Imagen", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdUsuarioC", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdCaja", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdTipoGrupo", Integer.class, ParameterMode.IN);
            rolconsola.setParameter("Bandera", Bandera);
            rolconsola.setParameter("NombreCaja", entidad.getNombreCaja());
            rolconsola.setParameter("sql", entidad.getSql());
            rolconsola.setParameter("Imagen", entidad.getImagen());
            rolconsola.setParameter("Estado", entidad.getEstado());
            rolconsola.setParameter("IdUsuarioC", IdUsuarioC);
            rolconsola.setParameter("IdCaja", entidad.getIdCaja());
            rolconsola.setParameter("IdTipoGrupo", entidad.getIdTipoGrupo());
            rolconsola.execute();
            return JSONObject.quote((String) rolconsola.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCDatosTableroMod insertar");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

    @Override
    public String ActualizarDatosTablero(CDatosTableroEntity entidad, Integer Bandera, Integer IdUsuarioC) {
                  try {
            StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("paCDatosTableroMod");
            rolconsola.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("NombreCaja", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("sql", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Imagen", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdUsuarioC", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdCaja", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdTipoGrupo", Integer.class, ParameterMode.IN);
            rolconsola.setParameter("Bandera", Bandera);
            rolconsola.setParameter("NombreCaja", entidad.getNombreCaja());
            rolconsola.setParameter("sql", entidad.getSql());
            rolconsola.setParameter("Imagen", entidad.getImagen());
            rolconsola.setParameter("Estado", entidad.getEstado());
            rolconsola.setParameter("IdUsuarioC", IdUsuarioC);
            rolconsola.setParameter("IdCaja", entidad.getIdCaja());
            rolconsola.setParameter("IdTipoGrupo", entidad.getIdTipoGrupo());
            rolconsola.execute();
            return JSONObject.quote((String) rolconsola.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCDatosTableroMod actualizar");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

}
