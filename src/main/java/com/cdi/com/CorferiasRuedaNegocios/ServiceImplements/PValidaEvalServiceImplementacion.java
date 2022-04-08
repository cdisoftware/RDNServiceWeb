package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.LogConsolaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PValidaEvalService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PValidaEvalServiceImplementacion implements PValidaEvalService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public String ConsultaPvalidaEval(Integer IdRueda, Integer IdPerfil) {
        try {
            StoredProcedureQuery consvaleval = repositorio.createNamedStoredProcedureQuery("paPValidaEval");
            consvaleval.registerStoredProcedureParameter("IdRueda", Integer.class, ParameterMode.IN);
            consvaleval.registerStoredProcedureParameter("IdPerfil", Integer.class, ParameterMode.IN);
            consvaleval.setParameter("IdRueda", IdRueda);
            consvaleval.setParameter("IdPerfil", IdPerfil);
            consvaleval.execute();
            return JSONObject.quote((String) consvaleval.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paPValidaEval");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }
}
