
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CAdmPreguntaEstandarModEntity;


public interface CAdmPreguntaEstandarModService {
    
    public String InsertaPreguntaEstandarOtroIdioma(CAdmPreguntaEstandarModEntity entidad,Integer bandera,String Idioma);
    
    public String ActualizaPreguntaEstandar(CAdmPreguntaEstandarModEntity entidad,Integer bandera,String Idioma);
    
    
    
}
