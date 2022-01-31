package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CEvaluacionEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.CEvaluacionService;
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
public class CEvaluacionServiceImplementacion implements CEvaluacionService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public List<CEvaluacionEntity> ConsultaEvaluacion(Integer Bandera, String Idioma, 
            Integer IdUsuario, Integer IdEvaluacion, Integer RuedaNegocio, Integer Estado,
            String Vigencia, String Nombre, String FechaEvaluacion, Integer TipoPerfil, 
            Integer TipoEva) {
         try {
            StoredProcedureQuery consciudadpais = repositorio.createNamedStoredProcedureQuery("paCEvaluacion");
            consciudadpais.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            consciudadpais.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            consciudadpais.registerStoredProcedureParameter("IdUsuario", Integer.class, ParameterMode.IN);
            consciudadpais.registerStoredProcedureParameter("IdEvaluacion", Integer.class, ParameterMode.IN);
            consciudadpais.registerStoredProcedureParameter("RuedaNegocio", Integer.class, ParameterMode.IN);
            consciudadpais.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            consciudadpais.registerStoredProcedureParameter("Vigencia", String.class, ParameterMode.IN);
            consciudadpais.registerStoredProcedureParameter("Nombre", String.class, ParameterMode.IN);
            consciudadpais.registerStoredProcedureParameter("FechaEvaluacion", String.class, ParameterMode.IN);
            consciudadpais.registerStoredProcedureParameter("TipoPerfil", Integer.class, ParameterMode.IN);
            consciudadpais.registerStoredProcedureParameter("TipoEva", Integer.class, ParameterMode.IN);
            consciudadpais.setParameter("Bandera", Bandera);
            consciudadpais.setParameter("Idioma", Idioma);
            consciudadpais.setParameter("IdUsuario", IdUsuario);
            consciudadpais.setParameter("IdEvaluacion", IdEvaluacion);
            consciudadpais.setParameter("RuedaNegocio", RuedaNegocio);
            consciudadpais.setParameter("Estado", Estado);
            consciudadpais.setParameter("Vigencia", Vigencia);
            consciudadpais.setParameter("Nombre", Nombre);
            consciudadpais.setParameter("FechaEvaluacion", FechaEvaluacion);
            consciudadpais.setParameter("TipoPerfil", TipoPerfil);
            consciudadpais.setParameter("TipoEva", TipoEva);
            return consciudadpais.getResultList();
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCEvaluacion");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
