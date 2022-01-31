
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CJornadaEntity;
import java.util.List;


public interface CJornadaService {
    
    public List<CJornadaEntity> ConsultaJornada(CJornadaEntity entidad,Integer bandera, 
            String Idioma);

}
