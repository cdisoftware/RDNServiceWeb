package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CAdminSalasConfigEntity;
import java.util.List;

public interface CAdminSalasConfigService {

    public List<CAdminSalasConfigEntity> ConsultaCAdminSalaConf(Integer Bandera, Integer IdRuedaNegocio);

}
