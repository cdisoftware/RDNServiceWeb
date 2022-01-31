package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CRedSocialAdmEntity;
import java.util.List;

public interface CRedSocialAdmService {

    public List<CRedSocialAdmEntity> ConsultarRedSocialAdm(Integer IdRed, String NombreRed, Integer bandera, Integer Estado);

    public String InsertarRedSocial(CRedSocialAdmEntity entidad, Integer Bandera);

    public String ActualizarRedSocial(CRedSocialAdmEntity entidad, Integer Bandera);
}
