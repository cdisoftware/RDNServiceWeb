package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CReporteParticipanteEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.CReporteParticipanteService;
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
public class CReporteParticipanteServiceImplementacion implements CReporteParticipanteService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public List<CReporteParticipanteEntity> ConsultaReporteParticipante(Integer Bandera, Integer IdParticipante, String NombreParticipante, Integer IdPerfil, String NombreRdn, String FechaRegistro, Integer IdRdn) {
        try {
            StoredProcedureQuery roles = repositorio.createNamedStoredProcedureQuery("paCReporteParticipante");
            roles.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            roles.registerStoredProcedureParameter("IdParticipante", Integer.class, ParameterMode.IN);
            roles.registerStoredProcedureParameter("NombreParticipante", String.class, ParameterMode.IN);
            roles.registerStoredProcedureParameter("IdPerfil", Integer.class, ParameterMode.IN);
            roles.registerStoredProcedureParameter("NombreRdn", String.class, ParameterMode.IN);
            roles.registerStoredProcedureParameter("FechaRegistro", String.class, ParameterMode.IN);
            roles.setParameter("Bandera", Bandera);
            roles.setParameter("IdParticipante", IdParticipante);
            roles.setParameter("NombreParticipante", NombreParticipante);
            roles.setParameter("IdPerfil", IdPerfil);
            roles.setParameter("NombreRdn", NombreRdn);
            roles.setParameter("FechaRegistro", FechaRegistro);
            return roles.getResultList();
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCReporteParticipante");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
