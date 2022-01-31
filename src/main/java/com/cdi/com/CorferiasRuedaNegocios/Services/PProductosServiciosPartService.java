
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.PProductosServiciosPartEntity;
import java.util.List;


public interface PProductosServiciosPartService {
    
    public List<PProductosServiciosPartEntity> ConsultaProductoServicios(Integer bandera,String Idioma,String NombreProducto,Integer IdRueda);
}
