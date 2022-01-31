package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.PAgendaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.LogConsolaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PAgendaService;
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
public class PAgendaServiceImplementacion implements PAgendaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public List<PAgendaEntity> ConsultaPAgenda(PAgendaEntity entidad, Integer Bandera, String Idioma, Integer IdUsuario, Integer IdRuedaNegocio, Integer IdPerfilRueda, Integer IdEstadoCita, Integer IdModulo, Integer IdCita) {
        try {
            StoredProcedureQuery permisos = repositorio.createNamedStoredProcedureQuery("paPAgenda");
            permisos.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdUsuario", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdRuedaNegocio", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdPerfilRueda", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdEstadoCita", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdModulo", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("Fecha", String.class, ParameterMode.IN);
               permisos.registerStoredProcedureParameter("IdCita", Integer.class, ParameterMode.IN);
            permisos.setParameter("Bandera", Bandera);
            permisos.setParameter("Idioma", Idioma);
            permisos.setParameter("IdUsuario", IdUsuario);
            permisos.setParameter("IdRuedaNegocio", IdRuedaNegocio);
            permisos.setParameter("IdPerfilRueda", IdPerfilRueda);
            permisos.setParameter("IdEstadoCita", IdEstadoCita);
            permisos.setParameter("IdModulo", IdModulo);
            permisos.setParameter("Fecha", entidad.getFechaCita());
            permisos.setParameter("IdCita", IdCita);
            return permisos.getResultList();
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paPAgenda");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
