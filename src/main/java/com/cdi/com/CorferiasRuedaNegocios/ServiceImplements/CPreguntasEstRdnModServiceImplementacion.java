package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CPreguntasEstRdnModEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.CPreguntasEstRdnModService;
import com.cdi.com.CorferiasRuedaNegocios.Services.LogConsolaService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CPreguntasEstRdnModServiceImplementacion implements CPreguntasEstRdnModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public String InsertarPreguntasEstRdn(CPreguntasEstRdnModEntity entidad, Integer bandera) {
          try {
            StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("paCPreguntasEstRdnMod");
            rolconsola.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdPreguntaEstandar", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdRuedaNegocio", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdPerfilRueda", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Visible", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Obliga", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("VisibleBusqueda", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdUsuario", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Inter", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Nacional", Integer.class, ParameterMode.IN);
            rolconsola.setParameter("bandera", bandera);
            rolconsola.setParameter("IdPreguntaEstandar", entidad.getIdPreguntaEstandar());
            rolconsola.setParameter("IdRuedaNegocio", entidad.getIdRuedaNegocio());
            rolconsola.setParameter("IdPerfilRueda", entidad.getIdPerfilRueda());
            rolconsola.setParameter("Visible", entidad.getVisible());
            rolconsola.setParameter("Obliga", entidad.getObliga());
            rolconsola.setParameter("VisibleBusqueda", entidad.getVisibleBusqueda());
            rolconsola.setParameter("Estado", entidad.getEstado());
            rolconsola.setParameter("IdUsuario", entidad.getIdUsuarioC());
            rolconsola.setParameter("Inter", entidad.getInternacional());
            rolconsola.setParameter("Nacional", entidad.getNacional());
            rolconsola.execute();
            return JSONObject.quote((String) rolconsola.getOutputParameterValue("respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCPreguntasEstRdnMod insertar");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

    @Override
    public String ActualizarPreguntasEstRdn(CPreguntasEstRdnModEntity entidad, Integer bandera) {
         try {
            StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("paCPreguntasEstRdnMod");
            rolconsola.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdPreguntaEstandar", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdRuedaNegocio", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdPerfilRueda", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Visible", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Obliga", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("VisibleBusqueda", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdUsuario", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Inter", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Nacional", Integer.class, ParameterMode.IN);
            rolconsola.setParameter("bandera", bandera);
            rolconsola.setParameter("IdPreguntaEstandar", entidad.getIdPreguntaEstandar());
            rolconsola.setParameter("IdRuedaNegocio", entidad.getIdRuedaNegocio());
            rolconsola.setParameter("IdPerfilRueda", entidad.getIdPerfilRueda());
            rolconsola.setParameter("Visible", entidad.getVisible());
            rolconsola.setParameter("Obliga", entidad.getObliga());
            rolconsola.setParameter("VisibleBusqueda", entidad.getVisibleBusqueda());
            rolconsola.setParameter("Estado", entidad.getEstado());
            rolconsola.setParameter("IdUsuario", entidad.getIdUsuarioC());
            rolconsola.setParameter("Inter", entidad.getInternacional());
            rolconsola.setParameter("Nacional", entidad.getNacional());
            rolconsola.execute();
            return JSONObject.quote((String) rolconsola.getOutputParameterValue("respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCPreguntasEstRdnMod actualizar");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

}
