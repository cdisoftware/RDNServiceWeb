
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CPreguntaEvaluacionPopEntity;
import java.util.List;


public interface CPreguntaEvaluacionPopService {
    
    public List<CPreguntaEvaluacionPopEntity> ConsultaPreguntaEvaluacionPop(Integer Bandera,String Idioma,
            Integer IdUsuario,Integer IdEvaluacion,Integer Estado,Integer IdPregunta);
}
