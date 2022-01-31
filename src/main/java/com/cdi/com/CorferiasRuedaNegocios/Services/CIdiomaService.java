
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CIdiomaEntity;
import java.util.List;


public interface CIdiomaService {
 
    public List<CIdiomaEntity> ConsultaIdioma(Integer Id,Integer Idsec, Integer bandera);
}
