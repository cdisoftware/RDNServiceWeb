
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CUsuarioRdnEntity;
import java.util.List;


public interface CUsuarioRdnService {
    
    public List<CUsuarioRdnEntity> ConsultaUsuarioRdn(Integer Bandera,Integer Idusuario);
    
}
