
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.PSubCategoriaSectorEntity;
import java.util.List;


public interface PSubCategoriaSectorService {
    
    public List<PSubCategoriaSectorEntity> ConsultaSubCategoriaSector(Integer Bandera,Integer IdSector,String Idioma);
    
}
