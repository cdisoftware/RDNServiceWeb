package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CAdminSalasEntity;
import java.util.List;

public interface CAdminSalasService {

    public List<CAdminSalasEntity> ConsultaCAdminSalas(Integer Bandera, Integer IdRuedaNegocio);
}
