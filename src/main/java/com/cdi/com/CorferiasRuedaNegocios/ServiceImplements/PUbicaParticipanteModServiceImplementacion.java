package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.PUbicaParticipanteEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.LogConsolaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PUbicaParticipanteService;
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
public class PUbicaParticipanteModServiceImplementacion implements PUbicaParticipanteService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public List<PUbicaParticipanteEntity> ConsultaUbicaParticipante(Integer Bandera, Integer IdParticipante, Integer IdRdn) {
        try {
            StoredProcedureQuery permisos = repositorio.createNamedStoredProcedureQuery("paPUbicaParticipante");
            permisos.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdParticipante", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdRdn", Integer.class, ParameterMode.IN);
            permisos.setParameter("Bandera", Bandera);
            permisos.setParameter("IdParticipante", IdParticipante);
            permisos.setParameter("IdRdn", IdRdn);
            return permisos.getResultList();
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paPUbicaParticipante");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

    @Override
    public String InsertarUbicaParticipante(PUbicaParticipanteEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("paPUbicaParticipanteMod");
            rolconsola.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdParticipante", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdRdn", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Pabellon", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Nivel", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Stand", Integer.class, ParameterMode.IN);
            rolconsola.setParameter("Bandera", Bandera);
            rolconsola.setParameter("IdParticipante", entidad.getIdParticipante());
            rolconsola.setParameter("IdRdn", entidad.getIdRuedaNegocio());
            rolconsola.setParameter("Pabellon", entidad.getPabellon());
            rolconsola.setParameter("Nivel", entidad.getNivel());
            rolconsola.setParameter("Stand", entidad.getStand());
            rolconsola.execute();
            return JSONObject.quote((String) rolconsola.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paPUbicaParticipanteMod insertar");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

    @Override
    public String ActualizarUbicaParticipante(PUbicaParticipanteEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("paPUbicaParticipanteMod");
            rolconsola.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdParticipante", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("IdRdn", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Pabellon", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Nivel", Integer.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("Stand", Integer.class, ParameterMode.IN);
            rolconsola.setParameter("Bandera", Bandera);
            rolconsola.setParameter("IdParticipante", entidad.getIdParticipante());
            rolconsola.setParameter("IdRdn", entidad.getIdRuedaNegocio());
            rolconsola.setParameter("Pabellon", entidad.getPabellon());
            rolconsola.setParameter("Nivel", entidad.getNivel());
            rolconsola.setParameter("Stand", entidad.getStand());
            rolconsola.execute();
            return JSONObject.quote((String) rolconsola.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paPUbicaParticipanteMod actualizar");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

}
