package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.LogConsolaService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.springframework.stereotype.Service;

@Service
public class LogConsolaServiceImplementacion implements LogConsolaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String InsertaLog(LogConsolaEntity entidad) {
        StoredProcedureQuery log = repositorio.createNamedStoredProcedureQuery("paLogConsola");
        log.registerStoredProcedureParameter("Servicio", String.class, ParameterMode.IN);
        log.registerStoredProcedureParameter("Mensaje", String.class, ParameterMode.IN);
        log.registerStoredProcedureParameter("Codigo", String.class, ParameterMode.IN);
        log.registerStoredProcedureParameter("Tipo", Integer.class, ParameterMode.IN);
        log.setParameter("Servicio", entidad.getServicio());
        log.setParameter("Mensaje", entidad.getMensaje());
        log.setParameter("Codigo", entidad.getCodigo());
        log.setParameter("Tipo", 1);
        log.execute();
        return "Log Insertado";
    }

}
