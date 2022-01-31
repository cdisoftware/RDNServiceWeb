
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CListaTipoRespuestaEntity;
import java.util.List;


public interface CListaTipoRespuestaService {
    
    public List<CListaTipoRespuestaEntity> ConsultaListaTipoRespuesta(Integer Bandera,String Idioma);
}
