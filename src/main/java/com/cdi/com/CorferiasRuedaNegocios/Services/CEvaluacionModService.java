package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CEvaluacionModEntity;

public interface CEvaluacionModService {

    public String InsertarEvaluacion(CEvaluacionModEntity entidad, Integer Bandera, String Idioma, Integer IdUsuario, Integer IdEvaluacion);

    public String ActualizarEvaluacion(CEvaluacionModEntity entidad, Integer Bandera, String Idioma, Integer IdUsuario, Integer IdEvaluacion);

}
