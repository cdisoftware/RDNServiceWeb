
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.PRegistroParticipanteEntity;
import java.util.List;


public interface PRegistroParticipanteService {
    
    public List<PRegistroParticipanteEntity> ConsultaRegistroParticipante(Integer Bandera,String Idioma,Integer IdParticipante,String NoIdentificacion);
    
}
