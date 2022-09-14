package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.PLinkSalaCitaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.LogConsolaService;
import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.PLinkSalaCitaService;
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
public class PLinkSalaCitaServiceImplementacion implements PLinkSalaCitaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public List<PLinkSalaCitaEntity> ConsultaPLinkSalaCita(Integer bandera, Integer IdRueda, Integer IdAgenda) {
        try {
            StoredProcedureQuery consciudadpais = repositorio.createNamedStoredProcedureQuery("paPLinkSalaCita");
            consciudadpais.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            consciudadpais.registerStoredProcedureParameter("IdRueda", Integer.class, ParameterMode.IN);
            consciudadpais.registerStoredProcedureParameter("IdAgenda", Integer.class, ParameterMode.IN);

            consciudadpais.setParameter("bandera", bandera);
            consciudadpais.setParameter("IdRueda", IdRueda);
            consciudadpais.setParameter("IdAgenda", IdAgenda);

            return consciudadpais.getResultList();
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paPLinkSalaCita");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
