package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CActualizaAuditoriaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.CActualizaAuditoriaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.LogConsolaService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CActualizaAuditoriaServiceImplementacion implements CActualizaAuditoriaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public String ActualizarAuditoriaServ(CActualizaAuditoriaEntity entidad, String Auditoria) {
        try {
            StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("paCActualizaAuditoria");
            rolconsola.registerStoredProcedureParameter("Tabla", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Auditoria", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("INS", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("DEL", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("UDP", String.class, ParameterMode.IN);
            rolconsola.setParameter("Tabla", entidad.getTABLA());
            rolconsola.setParameter("Auditoria", Auditoria);
            rolconsola.setParameter("INS", entidad.getOP_INS());
            rolconsola.setParameter("DEL", entidad.getOP_DEL());
            rolconsola.setParameter("UDP", entidad.getOP_UPD());
            rolconsola.execute();
            return JSONObject.quote((String) rolconsola.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCActualizaAuditoria actualizar");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

}
