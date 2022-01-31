
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CPreguntaEvaluacionModeEntity;


public interface CPreguntaEvaluacionModService {
    
    public  String InsertaPreguntasEvaluacion(CPreguntaEvaluacionModeEntity entidad, Integer Bandera, String Idioma, Integer IdOrigen);
    
    public  String ActualizarPreguntasEvaluacion(CPreguntaEvaluacionModeEntity entidad, Integer Bandera, String Idioma, Integer IdOrigen);
}
