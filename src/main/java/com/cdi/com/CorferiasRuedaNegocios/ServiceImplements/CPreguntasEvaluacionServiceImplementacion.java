package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CPreguntasEvaluacionEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.CPreguntasEvaluacionService;
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
public class CPreguntasEvaluacionServiceImplementacion implements CPreguntasEvaluacionService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public List<CPreguntasEvaluacionEntity> ConsultarPreguntasEvaluacion(Integer Bandera,
            String Idioma, Integer IdUsuario, Integer IdEvaluacion, Integer Estado) {
        try {
            StoredProcedureQuery roles = repositorio.createNamedStoredProcedureQuery("paCPreguntasEvaluacion");
            roles.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            roles.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            roles.registerStoredProcedureParameter("IdUsuario", Integer.class, ParameterMode.IN);
            roles.registerStoredProcedureParameter("IdEvaluacion", Integer.class, ParameterMode.IN);
            roles.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            roles.setParameter("Bandera", Bandera);
            roles.setParameter("Idioma", Idioma);
            roles.setParameter("IdUsuario", IdUsuario);
            roles.setParameter("IdEvaluacion", IdEvaluacion);
            roles.setParameter("Estado", Estado);
            return roles.getResultList();
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCPreguntasEvaluacion");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
