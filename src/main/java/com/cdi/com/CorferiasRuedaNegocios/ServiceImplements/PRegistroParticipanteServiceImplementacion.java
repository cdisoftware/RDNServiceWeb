package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.PRegistroParticipanteEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.LogConsolaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PRegistroParticipanteService;
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
public class PRegistroParticipanteServiceImplementacion implements PRegistroParticipanteService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public List<PRegistroParticipanteEntity> ConsultaRegistroParticipante(Integer Bandera, String Idioma, Integer IdParticipante,String NoIdentificacion) {
        try {
            StoredProcedureQuery usucons = repositorio.createNamedStoredProcedureQuery("paPRegistroParticipante");
            usucons.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            usucons.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            usucons.registerStoredProcedureParameter("IdParticipante", Integer.class, ParameterMode.IN);
            usucons.registerStoredProcedureParameter("NoIdentificacion", String.class, ParameterMode.IN);
            usucons.setParameter("Bandera", Bandera);
            usucons.setParameter("Idioma", Idioma);
            usucons.setParameter("IdParticipante", IdParticipante);   
            usucons.setParameter("NoIdentificacion", NoIdentificacion);   
            return usucons.getResultList();
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paPRegistroParticipante");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
