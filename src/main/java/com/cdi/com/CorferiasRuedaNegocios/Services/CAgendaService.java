
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CAgendaEntity;
import java.util.List;


public interface CAgendaService {
    
    public List<CAgendaEntity> ConsultaAgenda(CAgendaEntity entidad, Integer bandera,
            String Idioma,Integer IdRuedaNegocio, Integer IdPerfilRueda, String NoIdentifica,Integer IdParticipanteS, Integer IdParticipanteA);
}
