package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.CValidaUsuarioConsolaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.LogConsolaService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CValidaUsuarioConsolaServiceImplementacion implements CValidaUsuarioConsolaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public String ValidarUsuarioConsola(String Usuario) {
           try {
            StoredProcedureQuery validausu = repositorio.createNamedStoredProcedureQuery("paCValidaUsuarioConsola");
            validausu.registerStoredProcedureParameter("Usuario", String.class, ParameterMode.IN);
            validausu.setParameter("Usuario", Usuario);
            validausu.execute();
            return JSONObject.quote((String) validausu.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCValidaUsuarioConsola");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
            
        }
    }

}
