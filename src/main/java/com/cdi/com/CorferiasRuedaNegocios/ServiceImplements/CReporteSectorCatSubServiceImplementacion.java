package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CReporteSectorCatSubEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.CReporteSectorCatSubService;
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
public class CReporteSectorCatSubServiceImplementacion implements CReporteSectorCatSubService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public List<CReporteSectorCatSubEntity> ReporteSectorCatSub(Integer Bandera, Integer IdSector,
            Integer IdCategoria, Integer IdSubCategoria, String NombreSector, String NombreCategoria,
            String NombreSubCategoria, Integer IdRueda, Integer IdPerfil) {

        try {
            StoredProcedureQuery permisos = repositorio.createNamedStoredProcedureQuery("paCReporteSectorCatSub");
            permisos.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdSector", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdCategoria", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdSubCategoria", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("NombreSector", String.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("NombreCategoria", String.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("NombreSubCategoria", String.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdRueda", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdPerfil", Integer.class, ParameterMode.IN);
            permisos.setParameter("Bandera", Bandera);
            permisos.setParameter("IdSector", IdSector);
            permisos.setParameter("IdCategoria", IdCategoria);
            permisos.setParameter("IdSubCategoria", IdSubCategoria);
            permisos.setParameter("NombreSector", NombreSector);
            permisos.setParameter("NombreCategoria", NombreCategoria);
            permisos.setParameter("NombreSubCategoria", NombreSubCategoria);
            permisos.setParameter("IdRueda", IdRueda);
            permisos.setParameter("IdPerfil", IdPerfil);
            return permisos.getResultList();
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCReporteSectorCatSub");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }

    }

}
