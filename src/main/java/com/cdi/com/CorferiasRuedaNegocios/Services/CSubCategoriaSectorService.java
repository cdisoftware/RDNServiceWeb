
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CSubCategoriaSectorEntity;
import java.util.List;


public interface CSubCategoriaSectorService {
    
    public List<CSubCategoriaSectorEntity> CSubConsultaSubCategoriaSector(Integer Bandera,
            String Idioma, Integer IdCategoria,Integer IdSubCategoria,String NombreSubCategoria);
    
    public String CSubInsertarSubCategoriaSector(CSubCategoriaSectorEntity entidad, Integer Bandera,String Idioma);
    
    public String CSubActualizarSubCategoriaSector(CSubCategoriaSectorEntity entidad, Integer Bandera,String Idioma);
}
