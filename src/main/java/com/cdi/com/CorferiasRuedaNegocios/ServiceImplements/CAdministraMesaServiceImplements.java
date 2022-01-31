package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CAdministraMesaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.CAdministraMesaService;
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
public class CAdministraMesaServiceImplements implements CAdministraMesaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public List<CAdministraMesaEntity> ConsultarAdministrarMesa(Integer bandera, String Idioma, Integer IdRuedaNegocio) {
        try {
            StoredProcedureQuery permisos = repositorio.createNamedStoredProcedureQuery("paCAdministraMesa");
            permisos.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdRuedaNegocio", Integer.class, ParameterMode.IN);
            permisos.setParameter("bandera", bandera);
            permisos.setParameter("Idioma", Idioma);
            permisos.setParameter("IdRuedaNegocio", IdRuedaNegocio);
            return permisos.getResultList();
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCAdministraMesa");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

    @Override
    public String InsertarAdministraMesa(CAdministraMesaEntity entidad, Integer bandera, String Idioma) {
        try {
            StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("paCAdministraMesaMod");
            rolconsola.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdRuedaNegocio", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdMesa", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdUsuario", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("NoInicioMesa", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("NoFinMesa", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Pabellon", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Nivel", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("CriterioPais", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("CriterioEmpresa", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("CriterioContacto", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdTipoSeleccion", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdPerfilRueda", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdPais", Integer.class, ParameterMode.IN);            
            rolconsola.setParameter("bandera", bandera);
            rolconsola.setParameter("Idioma", Idioma);
            rolconsola.setParameter("IdRuedaNegocio", entidad.getIdRuedaNegocio());
            rolconsola.setParameter("IdMesa", entidad.getIdMesa());
            rolconsola.setParameter("IdUsuario", entidad.getIdUsuarioC());
            rolconsola.setParameter("NoInicioMesa", entidad.getNoInicioMesa());
            rolconsola.setParameter("NoFinMesa", entidad.getNoFinMesa());
            rolconsola.setParameter("Pabellon", entidad.getPabellon());
            rolconsola.setParameter("Nivel", entidad.getNivel());
            rolconsola.setParameter("CriterioPais", entidad.getCriterioPais());
            rolconsola.setParameter("CriterioEmpresa", entidad.getCriterioEmpresa());
            rolconsola.setParameter("CriterioContacto", entidad.getCriterioContacto());
            rolconsola.setParameter("IdTipoSeleccion", entidad.getIdTipoSeleccion());
            rolconsola.setParameter("Estado", entidad.getEstado());
            rolconsola.setParameter("IdPerfilRueda", entidad.getIdPerfilRueda());
            rolconsola.setParameter("IdPais", entidad.getIdPais());
            rolconsola.execute();
            return JSONObject.quote((String) rolconsola.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCAdministraMesaMod insertar");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

    @Override
    public String ActualizarAdministraMesa(CAdministraMesaEntity entidad, Integer bandera, String Idioma) {
            try {
            StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("paCAdministraMesaMod");
            rolconsola.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdRuedaNegocio", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdMesa", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdUsuario", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("NoInicioMesa", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("NoFinMesa", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Pabellon", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Nivel", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("CriterioPais", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("CriterioEmpresa", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("CriterioContacto", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdTipoSeleccion", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdPerfilRueda", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdPais", Integer.class, ParameterMode.IN);            
            rolconsola.setParameter("bandera", bandera);
            rolconsola.setParameter("Idioma", Idioma);
            rolconsola.setParameter("IdRuedaNegocio", entidad.getIdRuedaNegocio());
            rolconsola.setParameter("IdMesa", entidad.getIdMesa());
            rolconsola.setParameter("IdUsuario", entidad.getIdUsuarioC());
            rolconsola.setParameter("NoInicioMesa", entidad.getNoInicioMesa());
            rolconsola.setParameter("NoFinMesa", entidad.getNoFinMesa());
            rolconsola.setParameter("Pabellon", entidad.getPabellon());
            rolconsola.setParameter("Nivel", entidad.getNivel());
            rolconsola.setParameter("CriterioPais", entidad.getCriterioPais());
            rolconsola.setParameter("CriterioEmpresa", entidad.getCriterioEmpresa());
            rolconsola.setParameter("CriterioContacto", entidad.getCriterioContacto());
            rolconsola.setParameter("IdTipoSeleccion", entidad.getIdTipoSeleccion());
            rolconsola.setParameter("Estado", entidad.getEstado());
            rolconsola.setParameter("IdPerfilRueda", entidad.getIdPerfilRueda());
            rolconsola.setParameter("IdPais", entidad.getIdPais());
            rolconsola.execute();
            return JSONObject.quote((String) rolconsola.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCAdministraMesaMod actualizar");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

}
