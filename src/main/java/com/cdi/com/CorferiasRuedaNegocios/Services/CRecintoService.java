
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CRecintoEntity;
import java.util.List;


public interface CRecintoService {
    
    public List<CRecintoEntity> ConsultaRecinto(Integer bandera,String Idioma,Integer idusuario,
            String NombreRecinto, Integer IdRecinto, Integer Estado, String Imagen, Integer Publicar,Integer IdPais);
    
}
