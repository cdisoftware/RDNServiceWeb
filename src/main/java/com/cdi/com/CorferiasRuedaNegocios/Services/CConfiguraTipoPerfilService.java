
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CConfiguraTipoPerfilEntity;
import java.util.List;


public interface CConfiguraTipoPerfilService {
    
    public List<CConfiguraTipoPerfilEntity>ConsultaTipoPerfil(Integer bandera,Integer IdRdn,
            Integer IdTipoPerfil, String Descripcion, String Idioma);
}
