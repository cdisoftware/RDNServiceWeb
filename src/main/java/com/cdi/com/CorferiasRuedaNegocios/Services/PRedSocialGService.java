
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.PRedSocialGEntity;
import java.util.List;


public interface PRedSocialGService {
    
    public List <PRedSocialGEntity> ConsultaRedSocialG(Integer IdModulo,String IdFuncion,Integer Bandera);
    
}
