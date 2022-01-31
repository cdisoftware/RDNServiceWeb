
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CPreguntasEstRdnModEntity;




public interface CPreguntasEstRdnModService {
    
    public String InsertarPreguntasEstRdn(CPreguntasEstRdnModEntity entidad, Integer bandera);
    
    public String ActualizarPreguntasEstRdn(CPreguntasEstRdnModEntity entidad, Integer bandera);
    
}
