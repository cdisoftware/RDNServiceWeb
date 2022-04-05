package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.PSeguimientoCitaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.LogConsolaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PSeguimientoCitaService;
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
public class PSeguimientoCitaServiceImplementacion implements PSeguimientoCitaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public List<PSeguimientoCitaEntity> ConsultaPSegCita(Integer bandera, Integer IdRuedaNegocio, String FechaCita) {
        try {
            StoredProcedureQuery consegcita = repositorio.createNamedStoredProcedureQuery("paPSeguimientoCita");
            consegcita.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            consegcita.registerStoredProcedureParameter("IdRuedaNegocio", Integer.class, ParameterMode.IN);
            consegcita.registerStoredProcedureParameter("FechaCita", String.class, ParameterMode.IN);
            consegcita.setParameter("bandera", bandera);
            consegcita.setParameter("IdRuedaNegocio", IdRuedaNegocio);
            consegcita.setParameter("FechaCita", FechaCita);
            return consegcita.getResultList();
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paPSeguimientoCita");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
