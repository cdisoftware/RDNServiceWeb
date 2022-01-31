package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CValidaPermisoEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.CValidaPermisoService;
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
public class CValidaPermisoServiceImplementacion implements CValidaPermisoService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public List<CValidaPermisoEntity> ConsultaValidaPermisos(Integer bandera, 
            String Idioma, Integer IdContacto, Integer IdRueda) {
        try {
            StoredProcedureQuery roles = repositorio.createNamedStoredProcedureQuery("paCValidaPermiso");
            roles.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            roles.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            roles.registerStoredProcedureParameter("IdContacto", Integer.class, ParameterMode.IN);
            roles.registerStoredProcedureParameter("IdRueda", Integer.class, ParameterMode.IN);
            roles.setParameter("bandera", bandera);
            roles.setParameter("Idioma", Idioma);
            roles.setParameter("IdContacto", IdContacto);
            roles.setParameter("IdRueda", IdRueda);
            return roles.getResultList();
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCValidaPermiso");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
