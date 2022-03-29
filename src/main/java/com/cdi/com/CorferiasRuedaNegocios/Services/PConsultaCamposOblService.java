package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.PConsultaCamposOblEntity;
import java.util.List;

public interface PConsultaCamposOblService {

    public List<PConsultaCamposOblEntity> ConsultaPCampoObl(Integer Bandera, Integer IdRdn);
}
