package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.PChatEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.LogConsolaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PChatService;
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
public class PChatServiceImplementacion implements PChatService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public List<PChatEntity> ConsultaPChat(PChatEntity entidad, Integer Bandera, String Idioma) {
        try {
            StoredProcedureQuery conspchat = repositorio.createNamedStoredProcedureQuery("paPChat");
            conspchat.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            conspchat.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            conspchat.registerStoredProcedureParameter("IdRuedaNegocio", Integer.class, ParameterMode.IN);
            conspchat.registerStoredProcedureParameter("IdTipoChat", Integer.class, ParameterMode.IN);
            conspchat.registerStoredProcedureParameter("IdJornada", Integer.class, ParameterMode.IN);
            conspchat.registerStoredProcedureParameter("IdChat", Integer.class, ParameterMode.IN);
            conspchat.registerStoredProcedureParameter("Fecha", String.class, ParameterMode.IN);
            conspchat.registerStoredProcedureParameter("Hora", String.class, ParameterMode.IN);
            conspchat.setParameter("Bandera", Bandera);
            conspchat.setParameter("Idioma", Idioma);
            conspchat.setParameter("IdRuedaNegocio", entidad.getIdRuedaNegocio());
            conspchat.setParameter("IdTipoChat", entidad.getIdTipoChat());
            conspchat.setParameter("IdJornada", entidad.getIdJornadaActiva());
            conspchat.setParameter("IdChat", entidad.getIdChat());
            conspchat.setParameter("Fecha", entidad.getFechaActiva());
            conspchat.setParameter("Hora", entidad.getHorad());
            return conspchat.getResultList();
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paPChat consulta");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
