package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CJornadaModificaEntity;

public interface CJornadaModificaService {

    public String InsertarJornada(CJornadaModificaEntity entidad, Integer Bandera);

    public String ActualizarJornada(CJornadaModificaEntity entidad, Integer Bandera);
}
