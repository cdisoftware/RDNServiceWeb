package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CAyudaUsuarioRdnEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.CAyudaUsuarioRdnService;
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
public class CAyudaUsuarioRdnServiceImplementacion implements CAyudaUsuarioRdnService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public List<CAyudaUsuarioRdnEntity> AyudaUsuarioRdn(Integer bandera,Integer IdRuedaNegocio,String NombreRdn) {
        try {
            StoredProcedureQuery consfiltros = repositorio.createNamedStoredProcedureQuery("paCAyudaUsuarioRdn");
            consfiltros.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            consfiltros.registerStoredProcedureParameter("IdRuedaNegocio", Integer.class, ParameterMode.IN);
            consfiltros.registerStoredProcedureParameter("NombreRdn", String.class, ParameterMode.IN);
            consfiltros.setParameter("bandera", bandera);
            consfiltros.setParameter("IdRuedaNegocio", IdRuedaNegocio);
            consfiltros.setParameter("NombreRdn", NombreRdn);
            return consfiltros.getResultList();
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paCAyudaUsuarioRdn");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
