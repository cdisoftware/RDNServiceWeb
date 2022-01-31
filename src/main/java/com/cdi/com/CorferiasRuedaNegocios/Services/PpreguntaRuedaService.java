package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.PpreguntaRuedaEntity;
import java.util.List;

public interface PpreguntaRuedaService {

    public List<PpreguntaRuedaEntity> ConsultaPreguntaRueda(Integer Bandera, 
            Integer IdRuedaNegocio, String Idioma, Integer IdParticipante);

}
