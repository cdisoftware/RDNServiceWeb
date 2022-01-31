package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CCateSectorPartEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.CCateSectorPartService;
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
public class CCateSectorPartServiceImplementacion implements CCateSectorPartService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public List<CCateSectorPartEntity> ConsultaCateSectorPart(Integer Bandera, Integer IdRueda, Integer IdSector, Integer IdParticipante) {
        try {
            StoredProcedureQuery consciudadpais = repositorio.createNamedStoredProcedureQuery("paCCateSectorPart");
            consciudadpais.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            consciudadpais.registerStoredProcedureParameter("IdRueda", Integer.class, ParameterMode.IN);
            consciudadpais.registerStoredProcedureParameter("IdSector", Integer.class, ParameterMode.IN);
            consciudadpais.registerStoredProcedureParameter("IdParticipante", Integer.class, ParameterMode.IN);
            consciudadpais.setParameter("Bandera", Bandera);
            consciudadpais.setParameter("IdRueda", IdRueda);
            consciudadpais.setParameter("IdSector", IdSector);
            consciudadpais.setParameter("IdParticipante", IdParticipante);
            return consciudadpais.getResultList();
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCCateSectorPart");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
