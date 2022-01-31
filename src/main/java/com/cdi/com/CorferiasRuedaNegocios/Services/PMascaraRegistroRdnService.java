
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.PMascaraRegistroRdnEntity;
import java.util.List;


public interface PMascaraRegistroRdnService {
    
    public List<PMascaraRegistroRdnEntity> ConsultaMascaraRegistro(Integer IdLabel,Integer IdRdn);
    
}
