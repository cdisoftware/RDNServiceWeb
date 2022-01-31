package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CPataCategModificaEntity;

public interface CPataCategModificaService {

    public String InsertaPataCategoria(CPataCategModificaEntity entidad, String Idioma,Integer idusuario, Integer bandera);

    public String ActualizaPataCategoria(CPataCategModificaEntity entidad, String Idioma,Integer idusuario, Integer bandera);

}
