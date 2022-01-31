
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CRelDatosContactoEntity;
import java.util.List;


public interface CRelDatosContactoService {
    
    public List<CRelDatosContactoEntity> ConsultaDatosContacto(Integer Bandera,Integer IdRueda,Integer IdParticipante);
}
