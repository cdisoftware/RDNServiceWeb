package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CAdminSalasModEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.CAdminSalasModService;
import com.cdi.com.CorferiasRuedaNegocios.Services.LogConsolaService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CAdminSalasModServiceImplementacion implements CAdminSalasModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public String InsertaAdminSalas(CAdminSalasModEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery insertadminsala = repositorio.createNamedStoredProcedureQuery("paCAdminSalasMod");
            insertadminsala.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            insertadminsala.registerStoredProcedureParameter("IdRuedaNegocio", Integer.class, ParameterMode.IN);
            insertadminsala.registerStoredProcedureParameter("TipoSala", Integer.class, ParameterMode.IN);
            insertadminsala.registerStoredProcedureParameter("camara", Integer.class, ParameterMode.IN);
            insertadminsala.registerStoredProcedureParameter("mic", Integer.class, ParameterMode.IN);
            insertadminsala.registerStoredProcedureParameter("fullscreen", Integer.class, ParameterMode.IN);
            insertadminsala.registerStoredProcedureParameter("parlante", Integer.class, ParameterMode.IN);
            insertadminsala.registerStoredProcedureParameter("displayCapture", Integer.class, ParameterMode.IN);

            insertadminsala.setParameter("Bandera", Bandera);
            insertadminsala.setParameter("IdRuedaNegocio", entidad.getIdRuedaNegocio());
            insertadminsala.setParameter("TipoSala", entidad.getTipoSala());
            insertadminsala.setParameter("camara", entidad.getCamara());
            insertadminsala.setParameter("mic", entidad.getMic());
            insertadminsala.setParameter("fullscreen", entidad.getFullscreen());
            insertadminsala.setParameter("parlante", entidad.getParlante());
            insertadminsala.setParameter("displayCapture", entidad.getDisplayCapture());

            insertadminsala.execute();
            return JSONObject.quote((String) insertadminsala.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCAdminSalasMod insertar");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

    @Override
    public String ActualizaAdminSalas(CAdminSalasModEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery actuadminsala = repositorio.createNamedStoredProcedureQuery("paCAdminSalasMod");
            actuadminsala.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            actuadminsala.registerStoredProcedureParameter("IdRuedaNegocio", Integer.class, ParameterMode.IN);
            actuadminsala.registerStoredProcedureParameter("TipoSala", Integer.class, ParameterMode.IN);
            actuadminsala.registerStoredProcedureParameter("camara", Integer.class, ParameterMode.IN);
            actuadminsala.registerStoredProcedureParameter("mic", Integer.class, ParameterMode.IN);
            actuadminsala.registerStoredProcedureParameter("fullscreen", Integer.class, ParameterMode.IN);
            actuadminsala.registerStoredProcedureParameter("parlante", Integer.class, ParameterMode.IN);
            actuadminsala.registerStoredProcedureParameter("displayCapture", Integer.class, ParameterMode.IN);

            actuadminsala.setParameter("Bandera", Bandera);
            actuadminsala.setParameter("IdRuedaNegocio", entidad.getIdRuedaNegocio());
            actuadminsala.setParameter("TipoSala", entidad.getTipoSala());
            actuadminsala.setParameter("camara", entidad.getCamara());
            actuadminsala.setParameter("mic", entidad.getMic());
            actuadminsala.setParameter("fullscreen", entidad.getFullscreen());
            actuadminsala.setParameter("parlante", entidad.getParlante());
            actuadminsala.setParameter("displayCapture", entidad.getDisplayCapture());

            actuadminsala.execute();
            return JSONObject.quote((String) actuadminsala.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCAdminSalasMod Actualiza");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

}
