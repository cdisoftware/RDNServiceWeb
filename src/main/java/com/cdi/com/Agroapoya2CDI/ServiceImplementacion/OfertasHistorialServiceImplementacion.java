package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.OfertasHistorialEntity;
import com.cdi.com.Agroapoya2CDI.Services.OfertasHistorialService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class OfertasHistorialServiceImplementacion implements OfertasHistorialService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<OfertasHistorialEntity> ConsultaOfertasCarritoCompras(OfertasHistorialEntity entidad, Integer Bandera, Integer cnctivoOferta, Integer id_prdcto) {
        try {
            StoredProcedureQuery ofert = repositorio.createNamedStoredProcedureQuery("paC_OfertasHistorial");
            ofert.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            ofert.registerStoredProcedureParameter("usucodig", Integer.class, ParameterMode.IN);
            ofert.registerStoredProcedureParameter("cnctivoOferta", Integer.class, ParameterMode.IN);
            ofert.registerStoredProcedureParameter("id_prdcto", Integer.class, ParameterMode.IN);
            ofert.registerStoredProcedureParameter("Producto", String.class, ParameterMode.IN);
            ofert.registerStoredProcedureParameter("DescripcionProducto", String.class, ParameterMode.IN);

            ofert.setParameter("Bandera", Bandera);
            ofert.setParameter("usucodig", entidad.getUsuCodig());
            ofert.setParameter("cnctivoOferta", cnctivoOferta);
            ofert.setParameter("id_prdcto", id_prdcto);
            ofert.setParameter("Producto", entidad.getProducto());
            ofert.setParameter("DescripcionProducto", entidad.getDescripcionProducto());

            return ofert.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }
}
