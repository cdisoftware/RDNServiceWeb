package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.PopcionesRtaPregunta;
import com.cdi.com.CorferiasRuedaNegocios.Services.LogConsolaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PopcionesRtaPreguntaService;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PopcionesRtaPreguntaServiceImplementacion implements PopcionesRtaPreguntaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public String ConsultaOpcionesRta(Integer Bandera, Integer IdRuedaNegocio,
            String Idioma, Integer IdParticipante, Integer Origen, Integer IdPregunta) {
        try {
            StoredProcedureQuery permisos = repositorio.createNamedStoredProcedureQuery("paPopcionesRtaPregunta");
            permisos.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdRuedaNegocio", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdParticipante", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("Origen", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdPregunta", Integer.class, ParameterMode.IN);
            permisos.setParameter("Bandera", Bandera);
            permisos.setParameter("IdRuedaNegocio", IdRuedaNegocio);
            permisos.setParameter("Idioma", Idioma);
            permisos.setParameter("IdParticipante", IdParticipante);
            permisos.setParameter("Origen", Origen);
            permisos.setParameter("IdPregunta", IdPregunta);
            String res = (String) permisos.getOutputParameterValue("return");
            return res;

        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paPopcionesRtaPreguntaMod");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list.toString();
        }
    }

}
