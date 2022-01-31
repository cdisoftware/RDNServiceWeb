
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CCategoriaSectorEntity;
import java.util.List;


public interface CCategoriaSectorService {
    
    public List<CCategoriaSectorEntity> ConsultaCategoriaSector(Integer Bandera,String Idioma,
            Integer IdCategoria,String NombreCategoria, Integer IdSector, String NombreSector);
    
    public String InsertarCategoriaSector(CCategoriaSectorEntity entidad, Integer Bandera,String Idioma);
    
    public String ActualizarCategoriaSector(CCategoriaSectorEntity entidad, Integer Bandera,String Idioma);
}
