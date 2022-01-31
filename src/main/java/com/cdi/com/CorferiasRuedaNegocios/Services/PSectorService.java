
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.PSectorEntity;
import java.util.List;


public interface PSectorService {
    
    public List<PSectorEntity> ConsultaSectores(Integer Bandera,Integer IdRuedaNegocio,
            String Idioma, Integer IdSector);
}
