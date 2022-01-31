
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.PProductosServiciosEntity;
import java.util.List;


public interface PProductosServiciosService {
    
    public List<PProductosServiciosEntity> ConsultaProductosServicio(Integer bandera,String Idioma,
            String Producto, Integer IdParticipante, Integer IdProducto);
}
