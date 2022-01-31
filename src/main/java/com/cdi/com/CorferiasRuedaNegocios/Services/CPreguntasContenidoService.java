
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CPreguntasContenidoEntity;
import java.util.List;


public interface CPreguntasContenidoService {
    
    public List<CPreguntasContenidoEntity> ConsultarPreguntasContenido(Integer Bandera,Integer IdRueda,String Idioma );
    
    public String InsertarPreguntasContenido(CPreguntasContenidoEntity entidad, Integer Bandera, String Idioma);
    
    public String ActualizarPreguntasContenido(CPreguntasContenidoEntity entidad, Integer Bandera, String Idioma);
}
