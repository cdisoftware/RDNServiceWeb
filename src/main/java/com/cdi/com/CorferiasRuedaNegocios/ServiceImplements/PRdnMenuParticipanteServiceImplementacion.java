package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.PRdnMenuParticipanteEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.LogConsolaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PRdnMenuParticipanteService;
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
public class PRdnMenuParticipanteServiceImplementacion implements PRdnMenuParticipanteService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public List<PRdnMenuParticipanteEntity> ConsultaMenuParticipante(Integer Bandera, Integer IdContacto) {
        try {
            StoredProcedureQuery consfiltros = repositorio.createNamedStoredProcedureQuery("paPRdnMenuParticipante");
            consfiltros.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            consfiltros.registerStoredProcedureParameter("IdContacto", Integer.class, ParameterMode.IN);
            consfiltros.setParameter("Bandera", Bandera);
            consfiltros.setParameter("IdContacto", IdContacto);
            return consfiltros.getResultList();
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paPRdnMenuParticipante");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
