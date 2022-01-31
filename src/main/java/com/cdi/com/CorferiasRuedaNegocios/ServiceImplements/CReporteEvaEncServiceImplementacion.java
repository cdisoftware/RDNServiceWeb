package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CReporteEvaEncEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.CReporteEvaEncService;
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
public class CReporteEvaEncServiceImplementacion implements CReporteEvaEncService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public List<CReporteEvaEncEntity> ReporteEvaEncService(Integer Bandera,
            Integer IdRuedaNegocio, String NombreRdn, Integer TipoEva,
            String Nombreempresa, String Nit, Integer IdTipoPerfil, Integer IdEvaluacion) {

        try {
            StoredProcedureQuery permisos = repositorio.createNamedStoredProcedureQuery("paCReporteEvaEnc");
            permisos.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdRuedaNegocio", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("NombreRdn", String.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("TipoEva", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("Nombreempresa", String.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("Nit", String.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdTipoPerfil", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdEvaluacion", Integer.class, ParameterMode.IN);
            permisos.setParameter("Bandera", Bandera);
            permisos.setParameter("IdRuedaNegocio", IdRuedaNegocio);
            permisos.setParameter("NombreRdn", NombreRdn);
            permisos.setParameter("TipoEva", TipoEva);
            permisos.setParameter("Nombreempresa", Nombreempresa);
            permisos.setParameter("Nit", Nit);
            permisos.setParameter("IdTipoPerfil", IdTipoPerfil);
            permisos.setParameter("IdEvaluacion", IdEvaluacion);
            return permisos.getResultList();
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCReporteEvaEnc");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
