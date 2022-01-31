
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.PProductosServiciosModEntity;


public interface PProductosServiciosModService {
    
    public String InsertarProductosServicios(PProductosServiciosModEntity entidad, Integer Bandera,String Idioma);
    
    public String ActualizarProductosServicios(PProductosServiciosModEntity entidad, Integer Bandera,String Idioma);
}
