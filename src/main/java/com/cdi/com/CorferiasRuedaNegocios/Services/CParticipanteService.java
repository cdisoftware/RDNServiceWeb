package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CParticipanteEntity;
import java.util.List;

public interface CParticipanteService {

    public List<CParticipanteEntity> ConsultaCParticipante(CParticipanteEntity entidad, Integer Bandera, Integer IdRueda,
            String NombreRueda, String NoIdentificacion, Integer TipoPerfil, Integer Estado,
            String Participante, Integer IdPais, String Departamento,
            String Ciudad, String NombreContacto);
}
