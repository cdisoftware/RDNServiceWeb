
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CRuedaNegocioModEntity;


public interface CRuedaNegocioModService {
    
    public String InsertarRuedaNegocio(CRuedaNegocioModEntity entidad, Integer bandera,String Idioma);
    
    public String ActualizarRuedaNegocio(CRuedaNegocioModEntity entidad, Integer bandera,String Idioma);
    
    public String ActualizarReubicaRN(CRuedaNegocioModEntity entidad, Integer Bandera);
    
}