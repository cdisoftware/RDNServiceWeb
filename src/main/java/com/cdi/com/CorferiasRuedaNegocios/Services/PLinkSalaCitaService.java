package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.PLinkSalaCitaEntity;
import java.util.List;

public interface PLinkSalaCitaService {

    public List<PLinkSalaCitaEntity> ConsultaPLinkSalaCita(Integer bandera, Integer IdRueda, Integer IdAgenda);
}
