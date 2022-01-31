package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.PMesaChatModEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.LogConsolaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PMesaChatModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PMesaChatModServiceImplementacion implements PMesaChatModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public String InsertarMesaChat(PMesaChatModEntity entidad, Integer bandera, Integer Estado, Integer IdSala) {
        try {
            StoredProcedureQuery insertmesachat = repositorio.createNamedStoredProcedureQuery("paPMesaChatMod");
            insertmesachat.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            insertmesachat.registerStoredProcedureParameter("IdContactoS", Integer.class, ParameterMode.IN);
            insertmesachat.registerStoredProcedureParameter("IdContactoA", Integer.class, ParameterMode.IN);
            insertmesachat.registerStoredProcedureParameter("IdRdn", Integer.class, ParameterMode.IN);
            insertmesachat.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            insertmesachat.registerStoredProcedureParameter("IdUsuarioC", Integer.class, ParameterMode.IN);
            insertmesachat.registerStoredProcedureParameter("IdSala", Integer.class, ParameterMode.IN);
            insertmesachat.registerStoredProcedureParameter("IdTipoSala", Integer.class, ParameterMode.IN);
            insertmesachat.setParameter("bandera", bandera);
            insertmesachat.setParameter("IdContactoS", entidad.getIdContactoS());
            insertmesachat.setParameter("IdContactoA", entidad.getIdContactoA());
            insertmesachat.setParameter("IdRdn", entidad.getIdRuedaNegocio());
            insertmesachat.setParameter("Estado", Estado);
            insertmesachat.setParameter("IdUsuarioC", entidad.getIdUsuarioC());
            insertmesachat.setParameter("IdSala", IdSala);
            insertmesachat.setParameter("IdTipoSala", entidad.getIdTipoSala());
            insertmesachat.execute();
            return JSONObject.quote((String) insertmesachat.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paPMesaChatMod insertar");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

    @Override
    public String ActualizarMesaChat(PMesaChatModEntity entidad, Integer bandera, Integer Estado, Integer IdSala) {
        try {
            StoredProcedureQuery actumesachat = repositorio.createNamedStoredProcedureQuery("paPMesaChatMod");
            actumesachat.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            actumesachat.registerStoredProcedureParameter("IdContactoS", Integer.class, ParameterMode.IN);
            actumesachat.registerStoredProcedureParameter("IdContactoA", Integer.class, ParameterMode.IN);
            actumesachat.registerStoredProcedureParameter("IdRdn", Integer.class, ParameterMode.IN);
            actumesachat.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            actumesachat.registerStoredProcedureParameter("IdUsuarioC", Integer.class, ParameterMode.IN);
            actumesachat.registerStoredProcedureParameter("IdSala", Integer.class, ParameterMode.IN);
            actumesachat.registerStoredProcedureParameter("IdTipoSala", Integer.class, ParameterMode.IN);

            actumesachat.setParameter("bandera", bandera);
            actumesachat.setParameter("IdContactoS", entidad.getIdContactoS());
            actumesachat.setParameter("IdContactoA", entidad.getIdContactoA());
            actumesachat.setParameter("IdRdn", entidad.getIdRuedaNegocio());
            actumesachat.setParameter("Estado", Estado);
            actumesachat.setParameter("IdUsuarioC", entidad.getIdUsuarioC());
            actumesachat.setParameter("IdSala", IdSala);
            actumesachat.setParameter("IdTipoSala", entidad.getIdTipoSala());
            actumesachat.execute();
            return JSONObject.quote((String) actumesachat.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paPMesaChatMod actualizar");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

}
