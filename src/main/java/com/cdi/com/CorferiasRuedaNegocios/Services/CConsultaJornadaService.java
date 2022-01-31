package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CConsultaJornadaEntity;
import java.util.List;

public interface CConsultaJornadaService {

    public List<CConsultaJornadaEntity> ConsultaJornada(Integer bandera, String Idioma,
            String TipoEvento, Integer TipoJornada, String FechaDesde, Integer IdRueda, String NombreRueda);
}
