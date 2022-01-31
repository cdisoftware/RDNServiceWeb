
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CAyudaUsuarioRdnEntity;
import java.util.List;


public interface CAyudaUsuarioRdnService {
    
      public List<CAyudaUsuarioRdnEntity> AyudaUsuarioRdn(Integer bandera,Integer IdRuedaNegocio,String NombreRdn);
    
}
