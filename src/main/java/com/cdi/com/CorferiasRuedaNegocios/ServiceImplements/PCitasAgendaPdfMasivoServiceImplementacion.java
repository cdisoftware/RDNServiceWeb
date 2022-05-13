package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.PCitasAgendaPdfMasivoEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.LogConsolaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PCitasAgendaPdfMasivoService;
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
public class PCitasAgendaPdfMasivoServiceImplementacion implements PCitasAgendaPdfMasivoService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public List<PCitasAgendaPdfMasivoEntity> ConsultaPCitasAgendaPDFmasivo(Integer IdProceso) {
        try {
            StoredProcedureQuery conscitaspdf = repositorio.createNamedStoredProcedureQuery("paPCitasAgendaPdfMasivo");
            conscitaspdf.registerStoredProcedureParameter("IdProceso", Integer.class, ParameterMode.IN);
            conscitaspdf.setParameter("IdProceso", IdProceso);
            return conscitaspdf.getResultList();
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paPCitasAgendaPdfMasivo");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }
}
