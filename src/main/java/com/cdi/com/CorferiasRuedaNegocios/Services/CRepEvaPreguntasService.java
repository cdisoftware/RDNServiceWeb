
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CRepEvaPreguntasEntity;
import java.util.List;


public interface CRepEvaPreguntasService {
    
    public List<CRepEvaPreguntasEntity> ConsultaRepEvaPreguntas(Integer Bandera,Integer IdEvaluacion);
}
