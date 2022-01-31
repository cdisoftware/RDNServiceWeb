package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CChatMensConsEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.CChatMensConsService;
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
public class CChatMensConsServiceImplementacion implements CChatMensConsService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public List<CChatMensConsEntity> ConsultaChatMensCons(Integer Bandera, Integer IdContactoC, Integer IdContactoP, Integer IdSoporte,
            String Participante, String NoDocPart, String Usuario, String Fecha, Integer Estado, Integer EstadoC) {
        try {
            StoredProcedureQuery consciudadpais = repositorio.createNamedStoredProcedureQuery("paCChatMensCons");
            consciudadpais.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            consciudadpais.registerStoredProcedureParameter("IdContactoC", Integer.class, ParameterMode.IN);
            consciudadpais.registerStoredProcedureParameter("IdContactoP", Integer.class, ParameterMode.IN);
            consciudadpais.registerStoredProcedureParameter("IdSoporte", Integer.class, ParameterMode.IN);
            consciudadpais.registerStoredProcedureParameter("Participante", String.class, ParameterMode.IN);
            consciudadpais.registerStoredProcedureParameter("NoDocPart", String.class, ParameterMode.IN);
            consciudadpais.registerStoredProcedureParameter("Usuario", String.class, ParameterMode.IN);
            consciudadpais.registerStoredProcedureParameter("Fecha", String.class, ParameterMode.IN);
            consciudadpais.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            consciudadpais.registerStoredProcedureParameter("EstadoC", Integer.class, ParameterMode.IN);

            consciudadpais.setParameter("Bandera", Bandera);
            consciudadpais.setParameter("IdContactoC", IdContactoC);
            consciudadpais.setParameter("IdContactoP", IdContactoP);
            consciudadpais.setParameter("IdSoporte", IdSoporte);
            consciudadpais.setParameter("Participante", Participante);
            consciudadpais.setParameter("NoDocPart", NoDocPart);
            consciudadpais.setParameter("Usuario", Usuario);
            consciudadpais.setParameter("Fecha", Fecha);
            consciudadpais.setParameter("Estado", Estado);
            consciudadpais.setParameter("EstadoC", EstadoC);
            return consciudadpais.getResultList();
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCChatMensCons");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
