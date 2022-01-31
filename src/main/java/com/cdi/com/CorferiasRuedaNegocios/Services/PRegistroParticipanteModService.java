package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.PRegistroParticipanteModEntity;

public interface PRegistroParticipanteModService {

    public String InsertaRegistroParticipante(PRegistroParticipanteModEntity entidad, Integer Bandera, Integer IdUsuario);

    public String ActualizarRegistroParticipante(PRegistroParticipanteModEntity entidad, Integer Bandera, Integer IdUsuario);

}
