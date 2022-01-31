package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.PLogWebEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.LogConsolaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PLogWebService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PLogWebSeviceImplementacion implements PLogWebService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public String InsertaLogWeb(PLogWebEntity entidad) {

        try {
            StoredProcedureQuery log = repositorio.createNamedStoredProcedureQuery("paPLogWeb");
            log.registerStoredProcedureParameter("VistaWeb", String.class, ParameterMode.IN);
            log.registerStoredProcedureParameter("MensajeError", String.class, ParameterMode.IN);
            log.registerStoredProcedureParameter("Metodo", String.class, ParameterMode.IN);
            log.registerStoredProcedureParameter("Servicio", String.class, ParameterMode.IN);
            log.setParameter("VistaWeb", entidad.getVistaWeb());
            log.setParameter("MensajeError", entidad.getMensajeError());
            log.setParameter("Metodo", entidad.getMetodo());
            log.setParameter("Servicio", entidad.getServicio());
            log.execute();
            return JSONObject.quote("Log Insertado");
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paPLogWeb");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");

        }
    }

}
