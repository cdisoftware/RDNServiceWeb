
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CAsignaPaisesModEntity;


public interface CAsignaPaisesModService {
 
    public String InsertarAsignaPaises(CAsignaPaisesModEntity entidad, Integer Bandera, Integer IdPais);
    
    public String ActualizarAsignaPaises(CAsignaPaisesModEntity entidad, Integer Bandera, Integer IdPais);
    
}
