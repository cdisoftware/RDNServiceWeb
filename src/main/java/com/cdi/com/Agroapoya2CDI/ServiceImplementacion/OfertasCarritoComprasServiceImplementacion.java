package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.OfertasCarritoComprasEntity;
import com.cdi.com.Agroapoya2CDI.Services.OfertasCarritoComprasService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class OfertasCarritoComprasServiceImplementacion implements OfertasCarritoComprasService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<OfertasCarritoComprasEntity> ConsultaOfertasCarritoCompras(OfertasCarritoComprasEntity entidad, Integer Bandera, Integer cnctivoOferta, Integer id_prdcto) {
        try {
            StoredProcedureQuery compra = repositorio.createNamedStoredProcedureQuery("paC_OfertasCarritoCompras");
            compra.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            compra.registerStoredProcedureParameter("usucodig", Integer.class, ParameterMode.IN);
            compra.registerStoredProcedureParameter("cnctivoOferta", Integer.class, ParameterMode.IN);
            compra.registerStoredProcedureParameter("id_prdcto", Integer.class, ParameterMode.IN);
            compra.registerStoredProcedureParameter("Producto", String.class, ParameterMode.IN);
            compra.registerStoredProcedureParameter("DescripcionProducto", String.class, ParameterMode.IN);

            compra.setParameter("Bandera", Bandera);
            compra.setParameter("usucodig", entidad.getUsuCodig());
            compra.setParameter("cnctivoOferta", cnctivoOferta);
            compra.setParameter("id_prdcto", id_prdcto);
            compra.setParameter("Producto", entidad.getProducto());
            compra.setParameter("DescripcionProducto", entidad.getDescripcionProducto());

            return compra.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
