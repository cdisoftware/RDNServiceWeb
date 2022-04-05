package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.PAgendaSalaModEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.LogConsolaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PAgendaSalaModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PAgendaSalaModServiceImplementacion implements PAgendaSalaModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public String ActualizarAgendaSalaMod(PAgendaSalaModEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery agendasalamod = repositorio.createNamedStoredProcedureQuery("paPAgendaSalaMod");
            agendasalamod.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            agendasalamod.registerStoredProcedureParameter("IdRuedaNegocio", Integer.class, ParameterMode.IN);
            agendasalamod.registerStoredProcedureParameter("IdAgenda", Integer.class, ParameterMode.IN);
            agendasalamod.registerStoredProcedureParameter("idSala", Integer.class, ParameterMode.IN);
            agendasalamod.registerStoredProcedureParameter("linkSala", String.class, ParameterMode.IN);
            agendasalamod.registerStoredProcedureParameter("Horario", String.class, ParameterMode.IN);
            agendasalamod.registerStoredProcedureParameter("Contacto", Integer.class, ParameterMode.IN);

            agendasalamod.setParameter("Bandera", Bandera);
            agendasalamod.setParameter("IdRuedaNegocio", entidad.getIdRuedaNegocio());
            agendasalamod.setParameter("IdAgenda", entidad.getIdAgenda());
            agendasalamod.setParameter("idSala", entidad.getIdSala());
            agendasalamod.setParameter("linkSala", entidad.getLinkSala());
            agendasalamod.setParameter("Horario", entidad.getHorario());
            agendasalamod.setParameter("Contacto", entidad.getIdContactoUneSala());

            agendasalamod.execute();
            return JSONObject.quote((String) agendasalamod.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paPAgendaSalaMod insertar");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

}
