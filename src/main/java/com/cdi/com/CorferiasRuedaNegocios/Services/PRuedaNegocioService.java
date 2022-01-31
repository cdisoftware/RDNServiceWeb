
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.PRuedaNegocioEntity;
import java.util.List;


public interface PRuedaNegocioService {
    
    public List<PRuedaNegocioEntity> ConsultaPRuedaNegocio(Integer bandera,String Idioma,Integer Idusuario,
            Integer IdRuedaNegocio,String NombreRdn);
    
}
