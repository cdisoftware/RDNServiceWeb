package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.PValidaFechaSalaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.LogConsolaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PValidaFechaSalaService;
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
public class PValidaFechaSalaServiceImplementacion implements PValidaFechaSalaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public List<PValidaFechaSalaEntity> ConsultaPValidaFechaSala(Integer Bandera, Integer IdRueda, Integer IdAgenda) {
        try {
            StoredProcedureQuery respuest = repositorio.createNamedStoredProcedureQuery("paPValidaFechaSala");
            respuest.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            respuest.registerStoredProcedureParameter("IdRueda", Integer.class, ParameterMode.IN);
            respuest.registerStoredProcedureParameter("IdAgenda", Integer.class, ParameterMode.IN);

            respuest.setParameter("Bandera", Bandera);
            respuest.setParameter("IdRueda", IdRueda);
            respuest.setParameter("IdAgenda", IdAgenda);

            return respuest.getResultList();
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paPValidaFechaSala");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
