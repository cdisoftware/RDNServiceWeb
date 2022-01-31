package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.PParticipantesRDNEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.LogConsolaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PParticipantesRDNService;
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
public class PParticipantesRDNServiceImplementacion implements PParticipantesRDNService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public List<PParticipantesRDNEntity> ConsultaParticipanteRDN(Integer Bandera, Integer IdRueda,
            Integer IdParticipante, String NombreEmpresa, Integer IdPais, String IdDepartamento,
            String IdCiudad, String Url, Integer IdSector, Integer Sugerido, 
            Integer IdUsuario, String Nit, Integer IdCategoria, String NombreProductoClave) {
        try {
            StoredProcedureQuery consfiltros = repositorio.createNamedStoredProcedureQuery("paPParticipantesRDN");
            consfiltros.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            consfiltros.registerStoredProcedureParameter("IdRueda", Integer.class, ParameterMode.IN);
            consfiltros.registerStoredProcedureParameter("IdParticipante", Integer.class, ParameterMode.IN);
            consfiltros.registerStoredProcedureParameter("NombreEmpresa", String.class, ParameterMode.IN);
            consfiltros.registerStoredProcedureParameter("IdPais", Integer.class, ParameterMode.IN);
            consfiltros.registerStoredProcedureParameter("IdDepartamento", String.class, ParameterMode.IN);
            consfiltros.registerStoredProcedureParameter("IdCiudad", String.class, ParameterMode.IN);
            consfiltros.registerStoredProcedureParameter("Url", String.class, ParameterMode.IN);
            consfiltros.registerStoredProcedureParameter("IdSector", Integer.class, ParameterMode.IN);
            consfiltros.registerStoredProcedureParameter("Sugerido", Integer.class, ParameterMode.IN);
            consfiltros.registerStoredProcedureParameter("IdUsuario", Integer.class, ParameterMode.IN);
            consfiltros.registerStoredProcedureParameter("Nit", String.class, ParameterMode.IN);
            consfiltros.registerStoredProcedureParameter("IdCategoria", Integer.class, ParameterMode.IN);
            consfiltros.registerStoredProcedureParameter("NombreProductoClave", String.class, ParameterMode.IN);
            consfiltros.setParameter("Bandera", Bandera);
            consfiltros.setParameter("IdRueda", IdRueda);
            consfiltros.setParameter("IdParticipante", IdParticipante);
            consfiltros.setParameter("NombreEmpresa", NombreEmpresa);
            consfiltros.setParameter("IdPais", IdPais);
            consfiltros.setParameter("IdDepartamento", IdDepartamento);
            consfiltros.setParameter("IdCiudad", IdCiudad);
            consfiltros.setParameter("Url", Url);
            consfiltros.setParameter("IdSector", IdSector);
            consfiltros.setParameter("Sugerido", Sugerido);
            consfiltros.setParameter("IdUsuario", IdUsuario);
            consfiltros.setParameter("Nit", Nit);
            consfiltros.setParameter("IdCategoria", IdCategoria);
            consfiltros.setParameter("NombreProductoClave", NombreProductoClave);
            return consfiltros.getResultList();
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paPParticipantesRDN");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
