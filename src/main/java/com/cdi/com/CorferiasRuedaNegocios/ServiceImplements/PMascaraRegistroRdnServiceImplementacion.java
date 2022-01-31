package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.PMascaraRegistroRdnEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.LogConsolaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PMascaraRegistroRdnService;
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
public class PMascaraRegistroRdnServiceImplementacion implements PMascaraRegistroRdnService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public List<PMascaraRegistroRdnEntity> ConsultaMascaraRegistro(Integer IdLabel, Integer IdRdn) {
                try {
            StoredProcedureQuery permisos = repositorio.createNamedStoredProcedureQuery("paPMascaraRegistroRdn");
            permisos.registerStoredProcedureParameter("IdLabel", Integer.class, ParameterMode.IN);
            permisos.registerStoredProcedureParameter("IdRdn", Integer.class, ParameterMode.IN);
            permisos.setParameter("IdLabel", IdLabel);
            permisos.setParameter("IdRdn", IdRdn);
            return permisos.getResultList();
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paPMascaraRegistroRdn");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
