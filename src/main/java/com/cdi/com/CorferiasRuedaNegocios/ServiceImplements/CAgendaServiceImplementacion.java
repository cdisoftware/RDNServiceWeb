package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CAgendaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.CAgendaService;
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
public class CAgendaServiceImplementacion implements CAgendaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public List<CAgendaEntity> ConsultaAgenda(CAgendaEntity entidad, Integer bandera,
            String Idioma,Integer IdRuedaNegocio, Integer IdPerfilRueda, String NoIdentifica,Integer IdParticipanteS, Integer IdParticipanteA) {

        try {
            StoredProcedureQuery permisos = repositorio.createNamedStoredProcedureQuery("paCAgenda");
            permisos.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdRuedaNegocio", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdContacto", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdEstadoCita", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdPerfilRueda", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("FechaRdn", String.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("NombreEmpresa", String.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("NoIdentifica", String.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdParticipanteS", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdParticipanteA", Integer.class, ParameterMode.IN);
            permisos.setParameter("bandera", bandera);
            permisos.setParameter("Idioma", Idioma);
            permisos.setParameter("IdRuedaNegocio", IdRuedaNegocio);
            permisos.setParameter("IdContacto", entidad.getIdContactoAprueba());
            permisos.setParameter("IdEstadoCita", entidad.getEstadoCita());
            permisos.setParameter("IdPerfilRueda", IdPerfilRueda);
            permisos.setParameter("FechaRdn", entidad.getFechaCita());
            permisos.setParameter("NombreEmpresa", entidad.getQuienSolicita());
            permisos.setParameter("NoIdentifica", NoIdentifica);
            permisos.setParameter("IdParticipanteS",IdParticipanteS );
            permisos.setParameter("IdParticipanteA", IdParticipanteA);
            return permisos.getResultList();
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCAgenda");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
