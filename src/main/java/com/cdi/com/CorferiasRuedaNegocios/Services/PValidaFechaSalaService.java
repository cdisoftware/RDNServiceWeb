package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.PValidaFechaSalaEntity;
import java.util.List;

public interface PValidaFechaSalaService {

    public List<PValidaFechaSalaEntity> ConsultaPValidaFechaSala(Integer Bandera, Integer IdRueda, Integer IdAgenda);
}
