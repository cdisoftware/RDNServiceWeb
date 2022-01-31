
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CDatosContactoEntity;
import java.util.List;


public interface CDatosContactoService {
    
    public List<CDatosContactoEntity> ConsultaDatosContacto(Integer Bandera,Integer IdRueda,String Participante,
            String NoIdentificacion, Integer IdParticipante, Integer IdContacto);
}
