package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.PRedSocialGModEntity;

public interface PRedSocialGModService {

    public String InsertarRedSocialG(PRedSocialGModEntity entidad, Integer Bandera,
            Integer IdModulo);

    public String ActualizarRedSocialG(PRedSocialGModEntity entidad, Integer Bandera,
            Integer IdModulo);

}
