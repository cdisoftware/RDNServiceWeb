
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CAgendaPartEntity;
import java.util.List;


public interface CAgendaPartService {
    
    public List<CAgendaPartEntity> ConsultaAgendaPart(Integer bandera, Integer IdContactoS, Integer IdContactoA,
            Integer IdParticipanteS, Integer IdRuedaNegocio);
}
