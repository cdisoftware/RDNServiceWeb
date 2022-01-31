
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CUsuarioPermisoEntity;
import java.util.List;


public interface CUsuarioPermisoService {
    
    public List<CUsuarioPermisoEntity>ConsultaUsuarioPermiso(Integer Bandera,Integer Idusuario);
}
