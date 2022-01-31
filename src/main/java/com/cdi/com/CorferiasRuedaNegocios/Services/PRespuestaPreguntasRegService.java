
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.PRespuestaPreguntasRegEntity;


public interface PRespuestaPreguntasRegService {
    
    public String InsertarRespuestasPreguntas(PRespuestaPreguntasRegEntity entidad,Integer Bandera);
    
    public String ActualizarRespuestasPreguntas(PRespuestaPreguntasRegEntity entidad,Integer Bandera);
}
