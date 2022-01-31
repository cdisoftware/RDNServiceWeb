package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CRedSocialAdmEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.CRedSocialAdmService;
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
public class CRedSocialAdmServiceImplementacion implements CRedSocialAdmService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public List<CRedSocialAdmEntity> ConsultarRedSocialAdm(Integer IdRed, String NombreRed, Integer bandera, Integer Estado) {
        try {
            StoredProcedureQuery roles = repositorio.createNamedStoredProcedureQuery("paCRedSocialAdm");
            roles.registerStoredProcedureParameter("IdRed", Integer.class, ParameterMode.IN);
            roles.registerStoredProcedureParameter("NombreRed", String.class, ParameterMode.IN);
            roles.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            roles.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            roles.setParameter("IdRed", IdRed);
            roles.setParameter("NombreRed", NombreRed);
            roles.setParameter("bandera", bandera);
            roles.setParameter("Estado", Estado);
            return roles.getResultList();
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCRedSocialAdm");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

    @Override
    public String InsertarRedSocial(CRedSocialAdmEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("paCRedSocialAdmModifica");
            rolconsola.registerStoredProcedureParameter("IdRed", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("NombreRed", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Imagen", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            rolconsola.setParameter("IdRed", entidad.getIdRed());
            rolconsola.setParameter("Estado", entidad.getEstado());
            rolconsola.setParameter("NombreRed", entidad.getNombreRed());
            rolconsola.setParameter("Imagen", entidad.getImagen());
            rolconsola.setParameter("Bandera", Bandera);
            rolconsola.execute();
            return JSONObject.quote((String) rolconsola.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCRedSocialAdmModifica insertar");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

    @Override
    public String ActualizarRedSocial(CRedSocialAdmEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("paCRedSocialAdmModifica");
            rolconsola.registerStoredProcedureParameter("IdRed", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("NombreRed", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Imagen", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            rolconsola.setParameter("IdRed", entidad.getIdRed());
            rolconsola.setParameter("Estado", entidad.getEstado());
            rolconsola.setParameter("NombreRed", entidad.getNombreRed());
            rolconsola.setParameter("Imagen", entidad.getImagen());
            rolconsola.setParameter("Bandera", Bandera);
            rolconsola.execute();
            return JSONObject.quote((String) rolconsola.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCRedSocialAdmModifica actualizar");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }
}
