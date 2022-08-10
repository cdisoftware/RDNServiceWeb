package com.cdi.com.Agroapoya2CDI.ServiceImplementacion;

import com.cdi.com.Agroapoya2CDI.Entity.ProductoEntity;
import com.cdi.com.Agroapoya2CDI.Services.ProductoService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class ProductoServiceImplementacion implements ProductoService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<ProductoEntity> ConsultaProducto(ProductoEntity entidad, Integer bandera) {
        try {
            StoredProcedureQuery product = repositorio.createNamedStoredProcedureQuery("paT_Producto");
            product.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            product.registerStoredProcedureParameter("Nombre", String.class, ParameterMode.IN);
            product.setParameter("bandera", bandera);
            product.setParameter("Nombre", entidad.getDSCRPCION());
            return product.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
