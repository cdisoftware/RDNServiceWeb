
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CFechaRuedaEntity;
import java.util.List;


public interface CFechaRuedaService {
    
    public List<CFechaRuedaEntity> ConsultaFechaRueda(Integer bandera,Integer IdRueda);
}
