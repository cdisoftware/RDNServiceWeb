package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.PProductosServiciosEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.LogConsolaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PProductosServiciosService;
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
public class PProductosServiciosServiceImplementacion implements PProductosServiciosService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public List<PProductosServiciosEntity> ConsultaProductosServicio(Integer bandera, 
            String Idioma, String Producto, Integer IdParticipante, Integer IdProducto) {
        try {
            StoredProcedureQuery roles = repositorio.createNamedStoredProcedureQuery("paPProductosServicios");
            roles.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            roles.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            roles.registerStoredProcedureParameter("Producto", String.class, ParameterMode.IN);
            roles.registerStoredProcedureParameter("IdParticipante", Integer.class, ParameterMode.IN);
            roles.registerStoredProcedureParameter("IdProducto", Integer.class, ParameterMode.IN);
            roles.setParameter("bandera", bandera);
            roles.setParameter("Idioma", Idioma);
            roles.setParameter("Producto", Producto);
            roles.setParameter("IdParticipante", IdParticipante);
            roles.setParameter("IdProducto", IdProducto);
            return roles.getResultList();
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paPProductosServicios");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
