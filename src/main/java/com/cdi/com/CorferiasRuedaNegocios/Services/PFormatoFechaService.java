package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.PFormatoFechaEntity;
import java.util.List;

public interface PFormatoFechaService {

    public List<PFormatoFechaEntity> ConsultaFormatoFecha(Integer Bandera, Integer TipoFormato);
}
