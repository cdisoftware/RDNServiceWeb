
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CRepRespuestasEntity;
import java.util.List;


public interface CRepRespuestasService {
    
    public List<CRepRespuestasEntity> ConsultaRepRespuestas(Integer Bandera,Integer IdEvaluacion,Integer IdContacto);
}
