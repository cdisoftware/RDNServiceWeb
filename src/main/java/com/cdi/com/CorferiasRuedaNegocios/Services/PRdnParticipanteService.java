
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.PRdnParticipanteEntity;
import java.util.List;


public interface PRdnParticipanteService {
    
    public List<PRdnParticipanteEntity>ConsultaRdnParticipante(Integer Bandera,
            Integer IdContacto, Integer IdRdn, String Idioma);
}
