
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CSectorModEntity;


public interface CSectorModService {
    
    public String InsertarSectorMod(CSectorModEntity entidad, Integer Bandera,String Idioma);
    
    public String ActualizarSectorMod(CSectorModEntity entidad, Integer Bandera,String Idioma);
}
