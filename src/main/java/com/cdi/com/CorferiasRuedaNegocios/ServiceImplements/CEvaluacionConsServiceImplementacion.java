package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CEvaluacionConsEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.CEvaluacionConsService;
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
public class CEvaluacionConsServiceImplementacion implements CEvaluacionConsService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public List<CEvaluacionConsEntity> ConsultaCEvaluacionCons(Integer Bandera, String Idioma, Integer RuedaNegocio,
            Integer TipoPerfil, String Nombre, Integer TipoEva, Integer IdEvaluacion) {
        try {
            StoredProcedureQuery consciudadpais = repositorio.createNamedStoredProcedureQuery("paCEvaluacionCons");
            consciudadpais.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            consciudadpais.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            consciudadpais.registerStoredProcedureParameter("RuedaNegocio", Integer.class, ParameterMode.IN);
            consciudadpais.registerStoredProcedureParameter("TipoPerfil", Integer.class, ParameterMode.IN);
            consciudadpais.registerStoredProcedureParameter("Nombre", String.class, ParameterMode.IN);
            consciudadpais.registerStoredProcedureParameter("TipoEva", Integer.class, ParameterMode.IN);
            consciudadpais.registerStoredProcedureParameter("IdEvaluacion", Integer.class, ParameterMode.IN);
            consciudadpais.setParameter("Bandera", Bandera);
            consciudadpais.setParameter("Idioma", Idioma);
            consciudadpais.setParameter("RuedaNegocio", RuedaNegocio);
            consciudadpais.setParameter("TipoPerfil", TipoPerfil);
            consciudadpais.setParameter("Nombre", Nombre);
            consciudadpais.setParameter("TipoEva", TipoEva);
            consciudadpais.setParameter("IdEvaluacion", IdEvaluacion);
            return consciudadpais.getResultList();
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCEvaluacionCons");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
