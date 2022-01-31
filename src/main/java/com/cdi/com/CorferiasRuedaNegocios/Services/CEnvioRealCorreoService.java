
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CMasivoEnvioCorreoEntity;
import java.util.List;


public interface CEnvioRealCorreoService {
    
    public List<CMasivoEnvioCorreoEntity> ConsultaEnvioRealCorreo(Integer bandera,String Idioma, Integer IdEnvioCorreo);
    
}
