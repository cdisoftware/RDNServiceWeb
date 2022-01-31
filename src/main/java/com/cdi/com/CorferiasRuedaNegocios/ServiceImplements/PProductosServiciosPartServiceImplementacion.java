package com.cdi.com.CorferiasRuedaNegocios.ServiceImplements;

import com.cdi.com.CorferiasRuedaNegocios.Entity.LogConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.PProductosServiciosPartEntity;
import com.cdi.com.CorferiasRuedaNegocios.Services.LogConsolaService;
import com.cdi.com.CorferiasRuedaNegocios.Services.PProductosServiciosPartService;
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
public class PProductosServiciosPartServiceImplementacion implements PProductosServiciosPartService {

    @PersistenceContext
    private EntityManager repositorio;

    @Autowired
    private LogConsolaService service;

    @Override
    public List<PProductosServiciosPartEntity> ConsultaProductoServicios(Integer bandera,String Idioma,String NombreProducto,Integer IdRueda) {
        try {
            StoredProcedureQuery consfiltros = repositorio.createNamedStoredProcedureQuery("paPProductosServiciosPart");
            consfiltros.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            consfiltros.registerStoredProcedureParameter("Idioma", String.class, ParameterMode.IN);
            consfiltros.registerStoredProcedureParameter("NombreProducto", String.class, ParameterMode.IN);
            consfiltros.registerStoredProcedureParameter("IdRueda", Integer.class, ParameterMode.IN);
            consfiltros.setParameter("bandera", bandera);
            consfiltros.setParameter("Idioma", Idioma);
            consfiltros.setParameter("NombreProducto", NombreProducto);
            consfiltros.setParameter("IdRueda", IdRueda);
            return consfiltros.getResultList();
        } catch (Exception ex) {
            LogConsolaEntity entidadLog = new LogConsolaEntity();
            entidadLog.setCodigo(String.valueOf(ex.hashCode()));
            entidadLog.setMensaje(ex.getMessage());
            entidadLog.setServicio("Servicio paPProductosServiciosPart");
            entidadLog.setTipo(1);
            service.InsertaLog(entidadLog);
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
