package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CRelEmpresaEnvioCorreoEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.CRelEmpresaEnvioCorreoService;
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
public class CRelEmpresaEnvioCorreoServiceImplementacion implements CRelEmpresaEnvioCorreoService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public List<CRelEmpresaEnvioCorreoEntity> ConsultaRelacionEnvioCorreo(Integer Bandera,
            String Participante, Integer IdParticipante, Integer IdEnvioCorreo) {
        try {
            StoredProcedureQuery permisos = repositorio.createNamedStoredProcedureQuery("paCRelEmpresaEnvioCorreo");
            permisos.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("Participante", String.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdParticipante", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdEnvioCorreo", Integer.class, ParameterMode.IN);
            permisos.setParameter("Bandera", Bandera);
            permisos.setParameter("Participante", Participante);
            permisos.setParameter("IdParticipante", IdParticipante);
            permisos.setParameter("IdEnvioCorreo", IdEnvioCorreo);
            return permisos.getResultList();
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCRelEmpresaEnvioCorreo");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

    @Override
    public String InsertarRelacionEnvioCorreo(CRelEmpresaEnvioCorreoEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("paCRelEmpresaEnvioCorreoMod");
            rolconsola.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdParticipante", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdEnvioCorreo", Integer.class, ParameterMode.IN);
            rolconsola.setParameter("Bandera", Bandera);
            rolconsola.setParameter("IdParticipante", entidad.getIdParticipante());
            rolconsola.setParameter("IdEnvioCorreo", entidad.getIdEnvioCorreo());
            rolconsola.execute();
            return JSONObject.quote((String) rolconsola.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCRelEmpresaEnvioCorreoMod insertar");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

    @Override
    public String EliminarRelacionEnvioCorreo(CRelEmpresaEnvioCorreoEntity entidad, Integer Bandera) {
         try {
            StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("paCRelEmpresaEnvioCorreoMod");
            rolconsola.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdParticipante", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdEnvioCorreo", Integer.class, ParameterMode.IN);
            rolconsola.setParameter("Bandera", Bandera);
            rolconsola.setParameter("IdParticipante", entidad.getIdParticipante());
            rolconsola.setParameter("IdEnvioCorreo", entidad.getIdEnvioCorreo());
            rolconsola.execute();
            return JSONObject.quote((String) rolconsola.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCRelEmpresaEnvioCorreoMod actualizar");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

}
