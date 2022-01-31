package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.PAgendaEntity;
import java.util.List;

public interface PAgendaService {

    public List<PAgendaEntity> ConsultaPAgenda(PAgendaEntity entidad,Integer Bandera, String Idioma, Integer IdUsuario,
            Integer IdRuedaNegocio, Integer IdPerfilRueda, Integer IdEstadoCita, Integer IdModulo, Integer IdCita);

}
