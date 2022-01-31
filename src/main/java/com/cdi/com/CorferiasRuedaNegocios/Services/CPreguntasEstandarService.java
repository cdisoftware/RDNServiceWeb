
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CPreguntasEstandarEntity;
import java.util.List;


public interface CPreguntasEstandarService {
    
    public List<CPreguntasEstandarEntity> ConsultapreguntasEstandar(Integer bandera,String Idioma,Integer IdRdn,Integer IdPerfil);
    
}
