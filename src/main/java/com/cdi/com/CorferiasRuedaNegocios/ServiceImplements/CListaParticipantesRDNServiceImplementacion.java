package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CListaParticipantesRDNEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.CListaParticipantesRDNService;
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
public class CListaParticipantesRDNServiceImplementacion implements CListaParticipantesRDNService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public List<CListaParticipantesRDNEntity> ConsultaCListaParticipantesRDN(Integer Bandera, Integer IdRueda, Integer IdParticipante, String NombreEmpresa, String Nit, Integer IdPerfil) {
        try {
            StoredProcedureQuery listparticipantesrdn = repositorio.createNamedStoredProcedureQuery("paCListaParticipantesRDN");
            listparticipantesrdn.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            listparticipantesrdn.registerStoredProcedureParameter("IdRueda", Integer.class, ParameterMode.IN);
            listparticipantesrdn.registerStoredProcedureParameter("IdParticipante", Integer.class, ParameterMode.IN);
            listparticipantesrdn.registerStoredProcedureParameter("NombreEmpresa", String.class, ParameterMode.IN);
            listparticipantesrdn.registerStoredProcedureParameter("Nit", String.class, ParameterMode.IN);
            listparticipantesrdn.registerStoredProcedureParameter("IdPerfil", Integer.class, ParameterMode.IN);
            listparticipantesrdn.setParameter("Bandera", Bandera);
            listparticipantesrdn.setParameter("IdRueda", IdRueda);
            listparticipantesrdn.setParameter("IdParticipante", IdParticipante);
            listparticipantesrdn.setParameter("NombreEmpresa", NombreEmpresa);
            listparticipantesrdn.setParameter("Nit", Nit);
            listparticipantesrdn.setParameter("IdPerfil", IdPerfil);
            return listparticipantesrdn.getResultList();
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCListaParticipantesRDN");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
