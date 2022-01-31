package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CDefinirAuditoriaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.CDefinirAuditoriaService;
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
public class CDefinirAuditoriaServiceImplementacion implements CDefinirAuditoriaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public List<CDefinirAuditoriaEntity> ConsultaDefinirAuditoria(Integer Bandera, String Tabla, String Auditada, Integer Tipo) {
        try {
            StoredProcedureQuery consdefauditoria = repositorio.createNamedStoredProcedureQuery("paCDefinirAuditoria");
            consdefauditoria.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            consdefauditoria.registerStoredProcedureParameter("Tabla", String.class, ParameterMode.IN);
            consdefauditoria.registerStoredProcedureParameter("Auditada", String.class, ParameterMode.IN);
            consdefauditoria.registerStoredProcedureParameter("Tipo", Integer.class, ParameterMode.IN);
            consdefauditoria.setParameter("Bandera", Bandera);
            consdefauditoria.setParameter("Tabla", Tabla);
            consdefauditoria.setParameter("Auditada", Auditada);
            consdefauditoria.setParameter("Tipo", Tipo);
            return consdefauditoria.getResultList();
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCDefinirAuditoria");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
