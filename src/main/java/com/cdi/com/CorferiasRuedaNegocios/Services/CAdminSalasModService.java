package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CAdminSalasModEntity;

public interface CAdminSalasModService {

    public String InsertaAdminSalas(CAdminSalasModEntity entidad, Integer Bandera);

    public String ActualizaAdminSalas(CAdminSalasModEntity entidad, Integer Bandera);

}
