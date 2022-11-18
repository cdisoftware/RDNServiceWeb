package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.LogConsolaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.paCAsignaMesasLoteService;
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
public class paCAsignaMesasLoteServiceImplementacion implements paCAsignaMesasLoteService {
    
        @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public String AsignaMesa(Integer bandera, Integer IdRueda) {
    try {
            StoredProcedureQuery permisos = repositorio.createNamedStoredProcedureQuery("paCAsignaMesasLote");
            permisos.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdRuedaNegocio", Integer.class, ParameterMode.IN);
            permisos.setParameter("Bandera", bandera);
            permisos.setParameter("IdRuedaNegocio", IdRueda);
            return JSONObject.quote((String) permisos.getOutputParameterValue("Respuesta"));            
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCAdministraLinkRdn");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return "No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia";
        }
    }
    
}
