
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CValidaPermisoEntity;
import java.util.List;


public interface CValidaPermisoService {
    
    public List<CValidaPermisoEntity> ConsultaValidaPermisos(Integer bandera,String Idioma,Integer IdContacto,Integer IdRueda);
}
