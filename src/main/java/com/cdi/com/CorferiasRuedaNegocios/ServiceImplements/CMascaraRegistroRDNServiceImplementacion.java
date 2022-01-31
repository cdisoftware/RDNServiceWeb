package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CMascaraRegistroRDNEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.CMascaraRegistroRDNService;
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
public class CMascaraRegistroRDNServiceImplementacion implements CMascaraRegistroRDNService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public List<CMascaraRegistroRDNEntity> ConsultaMascaraRegistroRDN(Integer Bandera, Integer IdRdn, Integer IdLabel) {
        try {
            StoredProcedureQuery permisos = repositorio.createNamedStoredProcedureQuery("paCMascaraRegistroRDN");
            permisos.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdRdn", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdLabel", Integer.class, ParameterMode.IN);
            permisos.setParameter("Bandera", Bandera);
            permisos.setParameter("IdRdn", IdRdn);
            permisos.setParameter("IdLabel", IdLabel);
            return permisos.getResultList();
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCMascaraRegistroRDN");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

    @Override
    public String InsertarMascaraRegistro(CMascaraRegistroRDNEntity entidad, Integer Bandera, Integer IdLabel) {
        try {
            StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("paCMascaraRegistroRdnMod");
            rolconsola.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdRdn", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdLabel", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdUsuarioC", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Descripcion", String.class, ParameterMode.IN);
            rolconsola.setParameter("Bandera", Bandera);
            rolconsola.setParameter("IdRdn", entidad.getIdRuedaNegocio());
            rolconsola.setParameter("IdLabel", IdLabel);
            rolconsola.setParameter("IdUsuarioC", entidad.getIdUsuarioC());
            rolconsola.setParameter("Descripcion", entidad.getDescripcion());
            rolconsola.execute();
            return JSONObject.quote((String) rolconsola.getOutputParameterValue("respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCMascaraRegistroRdnMod insertar");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

    @Override
    public String ActualizarMascaraRegistro(CMascaraRegistroRDNEntity entidad, Integer Bandera, Integer IdLabel) {
          try {
            StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("paCMascaraRegistroRdnMod");
            rolconsola.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdRdn", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdLabel", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdUsuarioC", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Descripcion", String.class, ParameterMode.IN);
            rolconsola.setParameter("Bandera", Bandera);
            rolconsola.setParameter("IdRdn", entidad.getIdRuedaNegocio());
            rolconsola.setParameter("IdLabel", IdLabel);
            rolconsola.setParameter("IdUsuarioC", entidad.getIdUsuarioC());
            rolconsola.setParameter("Descripcion", entidad.getDescripcion());
            rolconsola.execute();
            return JSONObject.quote((String) rolconsola.getOutputParameterValue("respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCMascaraRegistroRdnMod actualizar");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

}
