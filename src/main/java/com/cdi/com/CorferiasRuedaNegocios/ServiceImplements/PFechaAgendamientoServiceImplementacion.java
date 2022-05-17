package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.LogConsolaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PFechaAgendamientoService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PFechaAgendamientoServiceImplementacion implements PFechaAgendamientoService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public String ConsultaPFechaAgenda(Integer IdRueda, String Idioma) {
        try {
            StoredProcedureQuery consFecha = repositorio.createNamedStoredProcedureQuery("paPFechaAgendamiento");
            consFecha.registerStoredProcedureParameter("IdRueda", Integer.class, ParameterMode.IN);
            consFecha.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            consFecha.setParameter("IdRueda", IdRueda);
            consFecha.setParameter("Idioma", Idioma);
            consFecha.execute();
            return JSONObject.quote((String) consFecha.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paPFechaAgendamiento");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }
}
