package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CDatosTableroPPEntity;
import java.util.List;

public interface CDatosTableroPPService {

    public List<CDatosTableroPPEntity> ConsultaDatosTableroPP(Integer Bandera, Integer IdCaja, Integer IdTipoGrupo);
}
