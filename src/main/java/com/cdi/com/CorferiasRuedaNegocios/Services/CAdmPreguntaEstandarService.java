
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CAdmPreguntaEstandarEntity;
import java.util.List;


public interface CAdmPreguntaEstandarService {
    
    public List<CAdmPreguntaEstandarEntity> ConsultaAdmPreguntasEstandar(Integer Bandera,String Idioma,
    String Pregunta, Integer IdPregunta);
}
