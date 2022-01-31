package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CAsignaAgendaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.CAsignaAgendaService;
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
public class CAsignaAgendaServiceImplementacion implements CAsignaAgendaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public List<CAsignaAgendaEntity> ConsultaAsignaAgenda(Integer bandera,Integer IdRuedaNegocio,String FechaJornada,
            String HoraInicio, String HoraFin, Integer IdHora, Integer IdParticipanteS, Integer IdParticipanteA, Integer IdContacto) {
        try {
            StoredProcedureQuery permisos = repositorio.createNamedStoredProcedureQuery("paCAsignaAgenda");
            permisos.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdRuedaNegocio", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("FechaJornada", String.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("HoraInicio", String.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("HoraFin", String.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdHora", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdParticipanteS", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdParticipanteA", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdContacto", Integer.class, ParameterMode.IN);
            permisos.setParameter("bandera", bandera);
            permisos.setParameter("IdRuedaNegocio", IdRuedaNegocio);
            permisos.setParameter("FechaJornada", FechaJornada);
            permisos.setParameter("HoraInicio", HoraInicio);
            permisos.setParameter("HoraFin", HoraFin);
            permisos.setParameter("IdHora", IdHora);
            permisos.setParameter("IdParticipanteS", IdParticipanteS);
            permisos.setParameter("IdParticipanteA", IdParticipanteA);
            permisos.setParameter("IdContacto", IdContacto);
            return permisos.getResultList();
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCAsignaAgenda");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
