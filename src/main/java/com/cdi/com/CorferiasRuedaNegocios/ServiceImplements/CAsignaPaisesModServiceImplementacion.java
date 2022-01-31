package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CAsignaPaisesModEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.CAsignaPaisesModService;
import com.cdi.com.CorferiasRuedaNegocios.Services.LogConsolaService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CAsignaPaisesModServiceImplementacion implements CAsignaPaisesModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public String InsertarAsignaPaises(CAsignaPaisesModEntity entidad, Integer Bandera,
            Integer IdPais) {
        try {
            StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("paCAsignaPaisesMod");
            rolconsola.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdUsuario", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdRdn", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdPerfilRueda", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdTipoSeleccion", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdAsignaPais", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdPais", Integer.class, ParameterMode.IN);
            rolconsola.setParameter("Bandera", Bandera);
            rolconsola.setParameter("IdUsuario", entidad.getIdUsuarioC());
            rolconsola.setParameter("IdRdn", entidad.getIdRuedaNegocio());
            rolconsola.setParameter("IdPerfilRueda", entidad.getIdPerfilRueda());
            rolconsola.setParameter("IdTipoSeleccion", entidad.getIdTipoSeleccionPais());
            rolconsola.setParameter("Estado", entidad.getEstado());
            rolconsola.setParameter("IdAsignaPais", entidad.getIdAsignaPais());
            rolconsola.setParameter("IdPais", IdPais);
            rolconsola.execute();
            return JSONObject.quote((String) rolconsola.getOutputParameterValue("respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCAsignaPaisesMod insertar");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

    @Override
    public String ActualizarAsignaPaises(CAsignaPaisesModEntity entidad, Integer Bandera, Integer IdPais) {
        try {
            StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("paCAsignaPaisesMod");
            rolconsola.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdUsuario", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdRdn", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdPerfilRueda", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdTipoSeleccion", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdAsignaPais", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdPais", Integer.class, ParameterMode.IN);
            rolconsola.setParameter("Bandera", Bandera);
            rolconsola.setParameter("IdUsuario", entidad.getIdUsuarioC());
            rolconsola.setParameter("IdRdn", entidad.getIdRuedaNegocio());
            rolconsola.setParameter("IdPerfilRueda", entidad.getIdPerfilRueda());
            rolconsola.setParameter("IdTipoSeleccion", entidad.getIdTipoSeleccionPais());
            rolconsola.setParameter("Estado", entidad.getEstado());
            rolconsola.setParameter("IdAsignaPais", entidad.getIdAsignaPais());
            rolconsola.setParameter("IdPais", IdPais);
            rolconsola.execute();
            return JSONObject.quote((String) rolconsola.getOutputParameterValue("respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCAsignaPaisesMod actualizar");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

}
