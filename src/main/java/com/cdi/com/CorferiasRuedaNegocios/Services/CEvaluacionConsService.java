package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CEvaluacionConsEntity;
import java.util.List;

public interface CEvaluacionConsService {

    public List<CEvaluacionConsEntity> ConsultaCEvaluacionCons(Integer Bandera, String Idioma, Integer RuedaNegocio, Integer TipoPerfil, 
            String Nombre, Integer TipoEva, Integer IdEvaluacion);
}
