
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CusuariosEnvioCorreoEntity;
import java.util.List;


public interface CusuariosEnvioCorreoService {
    
    public List<CusuariosEnvioCorreoEntity> ConsultaUsuariosEnvioCorreo(Integer bandera,Integer IdEnvioCorreo);
}
