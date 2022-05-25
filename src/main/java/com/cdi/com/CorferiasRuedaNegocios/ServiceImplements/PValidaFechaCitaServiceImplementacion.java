package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.LogConsolaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PValidaFechaCitaService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PValidaFechaCitaServiceImplementacion implements PValidaFechaCitaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public String ConsultaPFechaCita(String Idioma, Integer IdContactoS, String Fecha, String Hora, Integer IdRueda) {
        try {
            StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("paPValidaFechaCita");
            rolconsola.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdContactoS", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Fecha", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Hora", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdRueda", Integer.class, ParameterMode.IN);

            rolconsola.setParameter("Idioma", Idioma);
            rolconsola.setParameter("IdContactoS", IdContactoS);
            rolconsola.setParameter("Fecha", Fecha);
            rolconsola.setParameter("Hora", Hora);
            rolconsola.setParameter("IdRueda", IdRueda);

            rolconsola.execute();
            return JSONObject.quote((String) rolconsola.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje("hola" + ex.getMessage());
            entidadLog.setServicio("Servicio paPValidaFechaCita");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }
}
