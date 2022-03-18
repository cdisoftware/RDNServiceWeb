package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.LogConsolaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PValidaPerfilPartService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PValidaPerfilPartServiceImplementacion implements PValidaPerfilPartService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public String PvalidaPerfilPart(Integer IdParticipante, Integer IdRueda) {
        try {
            StoredProcedureQuery pvalperfl = repositorio.createNamedStoredProcedureQuery("paPValidaPerfilPart");
            pvalperfl.registerStoredProcedureParameter("IdParticipante", Integer.class, ParameterMode.IN);
            pvalperfl.registerStoredProcedureParameter("IdRueda", Integer.class, ParameterMode.IN);

            pvalperfl.setParameter("IdParticipante", IdParticipante);
            pvalperfl.setParameter("IdRueda", IdRueda);

            pvalperfl.execute();
            return JSONObject.quote((String) pvalperfl.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paPValidaPerfilPart");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

}
