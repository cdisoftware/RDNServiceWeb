package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.PSeguimientoCitaModEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.LogConsolaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PSeguimientoCitaModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PSeguimientoCitaModServiceImplementacion implements PSeguimientoCitaModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public String InsertaPSegCita(PSeguimientoCitaModEntity entidad, Integer bandera) {
        try {
            StoredProcedureQuery insertpsegcita = repositorio.createNamedStoredProcedureQuery("paPSeguimientoCitaMod");
            insertpsegcita.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            insertpsegcita.registerStoredProcedureParameter("IdRuedaNegocio", Integer.class, ParameterMode.IN);
            insertpsegcita.registerStoredProcedureParameter("IdAgenda", Integer.class, ParameterMode.IN);
            insertpsegcita.registerStoredProcedureParameter("Producto", String.class, ParameterMode.IN);
            insertpsegcita.registerStoredProcedureParameter("Interesado", Integer.class, ParameterMode.IN);
            insertpsegcita.registerStoredProcedureParameter("valorSpot", Float.class, ParameterMode.IN);
            insertpsegcita.registerStoredProcedureParameter("Valor3a6meses", Float.class, ParameterMode.IN);
            insertpsegcita.registerStoredProcedureParameter("Valor6a9meses", Float.class, ParameterMode.IN);
            insertpsegcita.registerStoredProcedureParameter("Valor9a12meses", Float.class, ParameterMode.IN);
            insertpsegcita.setParameter("bandera", bandera);
            insertpsegcita.setParameter("IdRuedaNegocio", entidad.getIdRuedaNegocio());
            insertpsegcita.setParameter("IdAgenda", entidad.getIdAgenda());
            insertpsegcita.setParameter("Producto", entidad.getProducto());
            insertpsegcita.setParameter("Interesado", entidad.getInteresado());
            insertpsegcita.setParameter("valorSpot", entidad.getValorSpot());
            insertpsegcita.setParameter("Valor3a6meses", entidad.getValor3a6meses());
            insertpsegcita.setParameter("Valor6a9meses", entidad.getValor6a9meses());
            insertpsegcita.setParameter("Valor9a12meses", entidad.getValor9a12meses());
            insertpsegcita.execute();
            return JSONObject.quote((String) insertpsegcita.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paPSeguimientoCitaMod insertar");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

    @Override
    public String ActualizaPSegCita(PSeguimientoCitaModEntity entidad, Integer bandera) {
        try {
            StoredProcedureQuery actpsegcita = repositorio.createNamedStoredProcedureQuery("paPSeguimientoCitaMod");
            actpsegcita.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            actpsegcita.registerStoredProcedureParameter("IdRuedaNegocio", Integer.class, ParameterMode.IN);
            actpsegcita.registerStoredProcedureParameter("IdAgenda", Integer.class, ParameterMode.IN);
            actpsegcita.registerStoredProcedureParameter("Producto", String.class, ParameterMode.IN);
            actpsegcita.registerStoredProcedureParameter("Interesado", Integer.class, ParameterMode.IN);
            actpsegcita.registerStoredProcedureParameter("valorSpot", Integer.class, ParameterMode.IN);
            actpsegcita.registerStoredProcedureParameter("Valor3a6meses", Integer.class, ParameterMode.IN);
            actpsegcita.registerStoredProcedureParameter("Valor6a9meses", Integer.class, ParameterMode.IN);
            actpsegcita.registerStoredProcedureParameter("Valor9a12meses", Integer.class, ParameterMode.IN);
            actpsegcita.setParameter("bandera", bandera);
            actpsegcita.setParameter("IdRuedaNegocio", entidad.getIdRuedaNegocio());
            actpsegcita.setParameter("IdAgenda", entidad.getIdAgenda());
            actpsegcita.setParameter("Producto", entidad.getProducto());
            actpsegcita.setParameter("Interesado", entidad.getInteresado());
            actpsegcita.setParameter("valorSpot", entidad.getValorSpot());
            actpsegcita.setParameter("Valor3a6meses", entidad.getValor3a6meses());
            actpsegcita.setParameter("Valor6a9meses", entidad.getValor6a9meses());
            actpsegcita.setParameter("Valor9a12meses", entidad.getValor9a12meses());
            actpsegcita.execute();
            return JSONObject.quote((String) actpsegcita.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paPSeguimientoCitaMod actualiza");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

}
