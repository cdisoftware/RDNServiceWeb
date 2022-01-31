package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CPreguntasRuedaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.CPreguntasRuedaService;
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
public class CPreguntasRuedaServiceImplementacion implements CPreguntasRuedaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public List<CPreguntasRuedaEntity> ConsultaPreguntasRueda(Integer Bandera, String Idioma,
            Integer IdUsuario, Integer IdRueda, Integer IdPerfil,Integer IdPregunta) {
           try {
            StoredProcedureQuery consciudadpais = repositorio.createNamedStoredProcedureQuery("paCPreguntasRueda");
            consciudadpais.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            consciudadpais.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            consciudadpais.registerStoredProcedureParameter("IdUsuario", Integer.class, ParameterMode.IN);
            consciudadpais.registerStoredProcedureParameter("IdRueda", Integer.class, ParameterMode.IN);
            consciudadpais.registerStoredProcedureParameter("IdPerfil", Integer.class, ParameterMode.IN);
            consciudadpais.registerStoredProcedureParameter("IdPregunta", Integer.class, ParameterMode.IN);
            consciudadpais.setParameter("Bandera", Bandera);
            consciudadpais.setParameter("Idioma", Idioma);
            consciudadpais.setParameter("IdUsuario", IdUsuario);
            consciudadpais.setParameter("IdRueda", IdRueda);
            consciudadpais.setParameter("IdPerfil", IdPerfil);
            consciudadpais.setParameter("IdPregunta", IdPregunta);
            return consciudadpais.getResultList();
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCPreguntasRueda");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
