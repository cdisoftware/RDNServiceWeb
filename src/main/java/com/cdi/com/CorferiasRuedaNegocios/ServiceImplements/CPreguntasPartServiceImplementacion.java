package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CPreguntasPartEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.CPreguntasPartService;
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
public class CPreguntasPartServiceImplementacion implements CPreguntasPartService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public List<CPreguntasPartEntity> ConsultaPreguntasPart(Integer Bandera, 
            Integer IdRueda, Integer IdParticipante, Integer IdPerfil) {
           try {
            StoredProcedureQuery permisos = repositorio.createNamedStoredProcedureQuery("paCPreguntasPart");
            permisos.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdRueda", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdParticipante", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdPerfil", Integer.class, ParameterMode.IN);
            permisos.setParameter("Bandera", Bandera);
            permisos.setParameter("IdRueda", IdRueda);
            permisos.setParameter("IdParticipante", IdParticipante);
            permisos.setParameter("IdPerfil", IdPerfil);
            return permisos.getResultList();
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCPreguntasPart");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
