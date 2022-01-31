
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CEvaluacionPartEntity;
import java.util.List;


public interface CEvaluacionPartService {
    
    public List<CEvaluacionPartEntity> ConsultaCEvaluacionPart(Integer Bandera, String Idioma,
            Integer IdEvaluacion, Integer RuedaNegocio, Integer TipoPerfil, Integer IdParticipante);
}
