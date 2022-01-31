package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CTerminoPoliticaModEntity;

public interface CTerminoPoliticaModService {

    public String InsertarTerminoPolitica(CTerminoPoliticaModEntity entidad, String Idioma, Integer bandera);

    public String ActualizarTerminoPolitica(CTerminoPoliticaModEntity entidad, String Idioma, Integer bandera);
}
