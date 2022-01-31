package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CRepRespuestasEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.CRepRespuestasService;
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
public class CRepRespuestasServiceImplementacion implements CRepRespuestasService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public List<CRepRespuestasEntity> ConsultaRepRespuestas(Integer Bandera, Integer IdEvaluacion, Integer IdContacto) {
         try {
            StoredProcedureQuery roles = repositorio.createNamedStoredProcedureQuery("paCRepRespuestas");
            roles.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            roles.registerStoredProcedureParameter("IdEvaluacion", Integer.class, ParameterMode.IN);
            roles.registerStoredProcedureParameter("IdContacto", Integer.class, ParameterMode.IN);
            roles.setParameter("Bandera", Bandera);
            roles.setParameter("IdEvaluacion", IdEvaluacion);
            roles.setParameter("IdContacto", IdContacto);
            return roles.getResultList();
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCRepRespuestas");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
