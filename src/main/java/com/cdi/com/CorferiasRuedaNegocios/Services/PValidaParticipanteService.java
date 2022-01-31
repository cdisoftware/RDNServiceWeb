
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.PValidaParticipanteEntity;
import java.util.List;


public interface PValidaParticipanteService {
    
    public List<PValidaParticipanteEntity> ConsultaValidaParticipante(Integer Bandera,String NoIdentificacion);
}
