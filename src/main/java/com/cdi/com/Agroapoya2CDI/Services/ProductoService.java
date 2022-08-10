package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.ProductoEntity;
import java.util.List;

public interface ProductoService {

    public List<ProductoEntity> ConsultaProducto(ProductoEntity entidad, Integer bandera);
}
