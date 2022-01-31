
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CPreguntasEstRdnEntity;
import java.util.List;


public interface CPreguntasEstRdnService {
    
    public List<CPreguntasEstRdnEntity> ConsultaPreguntasEstRdn(Integer bandera,String Idioma,Integer IdRdn,Integer IdPerfil);
    
}
