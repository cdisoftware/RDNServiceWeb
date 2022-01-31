
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CPreguntasRuedaEntity;
import java.util.List;


public interface CPreguntasRuedaService {
 
    public List<CPreguntasRuedaEntity> ConsultaPreguntasRueda(Integer Bandera,String Idioma,
            Integer IdUsuario,Integer IdRueda,Integer IdPerfil,Integer IdPregunta);
}
