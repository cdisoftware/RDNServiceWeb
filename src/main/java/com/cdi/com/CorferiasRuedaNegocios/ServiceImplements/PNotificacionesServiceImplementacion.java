package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.PNotificacionesEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.LogConsolaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PNotificacionesService;
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
public class PNotificacionesServiceImplementacion implements PNotificacionesService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public List<PNotificacionesEntity> ConsultaNotificaciones(Integer Bandera, String Idioma,
            Integer IdNotificacion, Integer Estado, Integer IdContacto, String Rueda) {
        try {
            StoredProcedureQuery roles = repositorio.createNamedStoredProcedureQuery("paPNotificaciones");
            roles.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            roles.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            roles.registerStoredProcedureParameter("IdNotificacion", Integer.class, ParameterMode.IN);
            roles.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            roles.registerStoredProcedureParameter("IdContacto", Integer.class, ParameterMode.IN);
            roles.registerStoredProcedureParameter("Rueda", String.class, ParameterMode.IN);
            roles.setParameter("Bandera", Bandera);
            roles.setParameter("Idioma", Idioma);
            roles.setParameter("IdNotificacion", IdNotificacion);
            roles.setParameter("Estado", Estado);
            roles.setParameter("IdContacto", IdContacto);
            roles.setParameter("Rueda", Rueda);
            return roles.getResultList();
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paPNotificaciones");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
