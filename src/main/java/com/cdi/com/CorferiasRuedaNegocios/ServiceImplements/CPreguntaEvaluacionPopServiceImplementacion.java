package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CPreguntaEvaluacionPopEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.CPreguntaEvaluacionPopService;
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
public class CPreguntaEvaluacionPopServiceImplementacion implements CPreguntaEvaluacionPopService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public List<CPreguntaEvaluacionPopEntity> ConsultaPreguntaEvaluacionPop(Integer Bandera, 
            String Idioma, Integer IdUsuario, Integer IdEvaluacion, Integer Estado, 
            Integer IdPregunta) {
         try {
            StoredProcedureQuery permisos = repositorio.createNamedStoredProcedureQuery("paCPreguntaEvaluacionPop");
            permisos.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdUsuario", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdEvaluacion", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdPregunta", Integer.class, ParameterMode.IN);
            permisos.setParameter("Bandera", Bandera);
            permisos.setParameter("Idioma", Idioma);
            permisos.setParameter("IdUsuario", IdUsuario);
            permisos.setParameter("IdEvaluacion", IdEvaluacion);
            permisos.setParameter("Estado", Estado);
            permisos.setParameter("IdPregunta", IdPregunta);
            return permisos.getResultList();
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCPreguntaEvaluacionPop");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
