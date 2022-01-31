
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.PRdnMenuParticipanteEntity;
import java.util.List;


public interface PRdnMenuParticipanteService {
    
    public List<PRdnMenuParticipanteEntity> ConsultaMenuParticipante(Integer Bandera, Integer IdContacto);
}
