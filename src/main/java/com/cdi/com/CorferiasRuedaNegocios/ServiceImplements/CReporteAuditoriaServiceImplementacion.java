package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CReporteAuditoriaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.CReporteAuditoriaService;
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
public class CReporteAuditoriaServiceImplementacion implements CReporteAuditoriaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public List<CReporteAuditoriaEntity> ConsultaReporteAuditoria(CReporteAuditoriaEntity entidad, String ORIGEN) {
        try {
            StoredProcedureQuery rolconsola = repositorio.createNamedStoredProcedureQuery("paCReporteAuditoria");
            rolconsola.registerStoredProcedureParameter("FECHAINI", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("FECHAFIN", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TABLA", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("USUARIO", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("TIPO_OPER", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("HORAINI", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("HORAFIN", String.class, ParameterMode.IN);
            rolconsola.registerStoredProcedureParameter("ORIGEN", String.class, ParameterMode.IN);

            rolconsola.setParameter("FECHAINI", entidad.getFechaInicio());
            rolconsola.setParameter("FECHAFIN", entidad.getFechaFin());
            rolconsola.setParameter("TABLA", entidad.getTabla());
            rolconsola.setParameter("USUARIO", entidad.getUsuCodig());
            rolconsola.setParameter("TIPO_OPER", entidad.getTIPOREGUPD());
            rolconsola.setParameter("HORAINI", entidad.getHoraInicio());
            rolconsola.setParameter("HORAFIN", entidad.getHoraFin());
            rolconsola.setParameter("ORIGEN", ORIGEN);
            return rolconsola.getResultList();
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCReporteAuditoria actualizar");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
