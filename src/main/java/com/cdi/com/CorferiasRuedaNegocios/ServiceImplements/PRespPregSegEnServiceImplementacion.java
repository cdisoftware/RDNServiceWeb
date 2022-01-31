package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.PRespPregSegEnEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.LogConsolaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PRespPregSegEnService;
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
public class PRespPregSegEnServiceImplementacion implements PRespPregSegEnService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public List<PRespPregSegEnEntity> ConsultaPRespPregSegEn(Integer Bandera, String Idioma, Integer IdEvaluacion, Integer IdRdn, Integer IdTipoPerfil,
            Integer IdParticipante, String Participante, Integer IdContacto, Integer IdPregunta) {
        try {
            StoredProcedureQuery consciudadpais = repositorio.createNamedStoredProcedureQuery("paPRespPregSegEn");
            consciudadpais.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            consciudadpais.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            consciudadpais.registerStoredProcedureParameter("IdEvaluacion", Integer.class, ParameterMode.IN);
            consciudadpais.registerStoredProcedureParameter("IdRdn", Integer.class, ParameterMode.IN);
            consciudadpais.registerStoredProcedureParameter("IdTipoPerfil", Integer.class, ParameterMode.IN);
            consciudadpais.registerStoredProcedureParameter("IdParticipante", Integer.class, ParameterMode.IN);
            consciudadpais.registerStoredProcedureParameter("Participante", String.class, ParameterMode.IN);
            consciudadpais.registerStoredProcedureParameter("IdContacto", Integer.class, ParameterMode.IN);
            consciudadpais.registerStoredProcedureParameter("IdPregunta", Integer.class, ParameterMode.IN);

            consciudadpais.setParameter("Bandera", Bandera);
            consciudadpais.setParameter("Idioma", Idioma);
            consciudadpais.setParameter("IdEvaluacion", IdEvaluacion);
            consciudadpais.setParameter("IdRdn", IdRdn);
            consciudadpais.setParameter("IdTipoPerfil", IdTipoPerfil);
            consciudadpais.setParameter("IdParticipante", IdParticipante);
            consciudadpais.setParameter("Participante", Participante);
            consciudadpais.setParameter("IdContacto", IdContacto);
            consciudadpais.setParameter("IdPregunta", IdPregunta);
            return consciudadpais.getResultList();
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paPRespPregSegEn");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
