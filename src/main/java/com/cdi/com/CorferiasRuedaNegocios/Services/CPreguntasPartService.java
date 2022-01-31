
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CPreguntasPartEntity;
import java.util.List;


public interface CPreguntasPartService {
    
    public List<CPreguntasPartEntity> ConsultaPreguntasPart(Integer Bandera,Integer IdRueda,Integer IdParticipante, Integer IdPerfil);
}
