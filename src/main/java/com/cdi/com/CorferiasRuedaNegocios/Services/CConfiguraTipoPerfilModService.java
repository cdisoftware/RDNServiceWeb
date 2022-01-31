package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CConfiguraTipoPerfilModEntity;

public interface CConfiguraTipoPerfilModService {

    public String InsertarConfiguraTipoPerfil(CConfiguraTipoPerfilModEntity entidad, Integer Bandera, String Idioma);

    public String ActualizarConfiguraTipoPerfil(CConfiguraTipoPerfilModEntity entidad, Integer Bandera, String Idioma);

    public String EliminarConfiguraTipoPerfil(CConfiguraTipoPerfilModEntity entidad, Integer Bandera, String Idioma);

}
