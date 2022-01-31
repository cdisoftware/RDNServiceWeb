package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CUsuarioConsultaRolesEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.CUsuarioConsultaRolesService;
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
public class CUsuarioConsultaRolesServiceImplementacion implements CUsuarioConsultaRolesService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public List<CUsuarioConsultaRolesEntity> ConsultaRoles(Integer Bandera, Integer Idusuario) {
        try {
            StoredProcedureQuery rolesconsola = repositorio.createNamedStoredProcedureQuery("paCUsuarioConsultaRoles");
            rolesconsola.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            rolesconsola.registerStoredProcedureParameter("Idusuario", Integer.class, ParameterMode.IN);
            rolesconsola.setParameter("Bandera", Bandera);
            rolesconsola.setParameter("Idusuario", Idusuario);
            return rolesconsola.getResultList();
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCUsuarioConsultaRoles");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }
}
