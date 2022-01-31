
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CTtListaRespuestasModEntity;


public interface CTtListaRespuestasModService {
    
    public String InsertarListaRespuestas(CTtListaRespuestasModEntity entidad,Integer Bandera,String Idioma);
    
    public String ActualizarListaRespuestas(CTtListaRespuestasModEntity entidad,Integer Bandera,String Idioma);
}
