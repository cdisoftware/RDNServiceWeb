package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.PConsultaChatEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.LogConsolaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PConsultaChatService;
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
public class PConsultaChatServiceImplementacion implements PConsultaChatService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public List<PConsultaChatEntity> ConsultaPChat(Integer Bandera, Integer IdContactoS, Integer IdContactoA) {
        try {
            StoredProcedureQuery conspchat = repositorio.createNamedStoredProcedureQuery("paPConsultaChat");
            conspchat.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            conspchat.registerStoredProcedureParameter("IdContactoS", Integer.class, ParameterMode.IN);
            conspchat.registerStoredProcedureParameter("IdContactoA", Integer.class, ParameterMode.IN);
            conspchat.setParameter("Bandera", Bandera);
            conspchat.setParameter("IdContactoS", IdContactoS);
            conspchat.setParameter("IdContactoA", IdContactoA);
            return conspchat.getResultList();
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paPConsultaChat");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
