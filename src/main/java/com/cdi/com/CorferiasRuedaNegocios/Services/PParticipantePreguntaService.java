
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.PParticipantePreguntaEntity;
import java.util.List;


public interface PParticipantePreguntaService {
    
    public List<PParticipantePreguntaEntity>ConsultaParticipantePregunta(Integer Bandera,
            Integer IdParticipante,String Idioma, Integer IdRueda);
}
