
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CPreguntasRuedaModEntity;


public interface CPreguntasRuedaModService {
    
    public String InsertarPreguntasRueda(CPreguntasRuedaModEntity entidad, Integer Bandera,String Idioma);
    
    public String ActualizarPreguntasRueda(CPreguntasRuedaModEntity entidad, Integer Bandera,String Idioma);
    
}
