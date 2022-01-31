package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.PTerminoPoliticaEntity;
import java.util.List;

public interface PTerminoPoliticaService {

    public List<PTerminoPoliticaEntity> ConsultaTerminoPolit(Integer bandera, String Idioma, Integer IdRueda, Integer IdParticipante, Integer IdPerfil);
}
