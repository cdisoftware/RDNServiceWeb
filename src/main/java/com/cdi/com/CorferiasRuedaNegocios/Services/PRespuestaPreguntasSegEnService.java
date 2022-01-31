package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.PRespuestaPreguntasSegEnEntity;

public interface PRespuestaPreguntasSegEnService {

    public String InsertarPreguntaSegEn(PRespuestaPreguntasSegEnEntity entidad, Integer Bandera, Integer IdUsuario);

    public String ActualizarPreguntaSegEn(PRespuestaPreguntasSegEnEntity entidad, Integer Bandera, Integer IdUsuario);
}
