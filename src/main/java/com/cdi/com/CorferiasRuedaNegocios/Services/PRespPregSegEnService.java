package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.PRespPregSegEnEntity;
import java.util.List;

public interface PRespPregSegEnService {

    public List<PRespPregSegEnEntity> ConsultaPRespPregSegEn(Integer Bandera, String Idioma, Integer IdEvaluacion, Integer IdRdn, Integer IdTipoPerfil, Integer IdParticipante,
            String Participante, Integer IdContacto, Integer IdPregunta);
}
