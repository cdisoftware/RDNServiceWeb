package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CFechaRuedaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.CFechaRuedaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.LogConsolaService;
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
public class CFechaRuedaServiceImplementacion implements CFechaRuedaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public List<CFechaRuedaEntity> ConsultaFechaRueda(Integer bandera, Integer IdRueda) {
        try {
            StoredProcedureQuery fecharueda = repositorio.createNamedStoredProcedureQuery("paCFechaRueda");
            fecharueda.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            fecharueda.registerStoredProcedureParameter("IdRueda", Integer.class, ParameterMode.IN);
            fecharueda.setParameter("bandera", bandera);
            fecharueda.setParameter("IdRueda", IdRueda);
            return fecharueda.getResultList();
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCFechaRueda");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;

        }
    }

}
