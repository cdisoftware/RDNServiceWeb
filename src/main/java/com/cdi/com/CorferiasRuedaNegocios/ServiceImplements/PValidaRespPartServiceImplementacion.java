package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.LogConsolaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PValidaRespPartService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PValidaRespPartServiceImplementacion implements PValidaRespPartService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public String ConsultaPValidaPart(Integer IdParticipante, Integer IdRueda) {
        try {
            StoredProcedureQuery consvalpart = repositorio.createNamedStoredProcedureQuery("paPValidaRespPart");
            consvalpart.registerStoredProcedureParameter("IdParticipante", Integer.class, ParameterMode.IN);
            consvalpart.registerStoredProcedureParameter("IdRueda", Integer.class, ParameterMode.IN);
            consvalpart.setParameter("IdParticipante", IdParticipante);
            consvalpart.setParameter("IdRueda", IdRueda);
            consvalpart.execute();
            return JSONObject.quote((String) consvalpart.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paPValidaRdnContacto");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }
}
