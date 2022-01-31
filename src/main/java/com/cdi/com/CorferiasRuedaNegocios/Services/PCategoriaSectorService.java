
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.PCategoriaSectorEntity;
import java.util.List;


public interface PCategoriaSectorService {
    
    List<PCategoriaSectorEntity>ConsultaCategoriaSector(Integer Bandera,Integer IdSector,String Idioma);
}
