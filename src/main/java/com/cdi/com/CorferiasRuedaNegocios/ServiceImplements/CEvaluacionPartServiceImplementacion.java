package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CEvaluacionPartEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.CEvaluacionPartService;
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
public class CEvaluacionPartServiceImplementacion implements CEvaluacionPartService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public List<CEvaluacionPartEntity> ConsultaCEvaluacionPart(Integer Bandera, String Idioma, Integer IdEvaluacion, Integer RuedaNegocio, Integer TipoPerfil, Integer IdParticipante) {
        try {
            StoredProcedureQuery consciudadpais = repositorio.createNamedStoredProcedureQuery("paCEvaluacionPart");
            consciudadpais.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            consciudadpais.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            consciudadpais.registerStoredProcedureParameter("IdEvaluacion", Integer.class, ParameterMode.IN);
            consciudadpais.registerStoredProcedureParameter("RuedaNegocio", Integer.class, ParameterMode.IN);
            consciudadpais.registerStoredProcedureParameter("TipoPerfil", Integer.class, ParameterMode.IN);
            consciudadpais.registerStoredProcedureParameter("IdParticipante", Integer.class, ParameterMode.IN);
            consciudadpais.setParameter("Bandera", Bandera);
            consciudadpais.setParameter("Idioma", Idioma);
            consciudadpais.setParameter("IdEvaluacion", IdEvaluacion);
            consciudadpais.setParameter("RuedaNegocio", RuedaNegocio);
            consciudadpais.setParameter("TipoPerfil", TipoPerfil);
             consciudadpais.setParameter("IdParticipante", IdParticipante);
            return consciudadpais.getResultList();
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCEvaluacionPart");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
