
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CPreguntasEvaluacionEntity;
import java.util.List;


public interface CPreguntasEvaluacionService {
    
    public List<CPreguntasEvaluacionEntity> ConsultarPreguntasEvaluacion(Integer Bandera,
            String Idioma,Integer IdUsuario,Integer IdEvaluacion, Integer Estado);
}
