
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CAsignaAgendaEntity;
import java.util.List;


public interface CAsignaAgendaService {
    
    public List<CAsignaAgendaEntity> ConsultaAsignaAgenda(Integer bandera,Integer IdRuedaNegocio,String FechaJornada,
            String HoraInicio, String HoraFin, Integer IdHora, Integer IdParticipanteS, Integer IdParticipanteA, Integer IdContacto);
}
