package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CTipoPagosTransEntity;
import java.util.List;

public interface CTipoPagosTransService {

    public List<CTipoPagosTransEntity> ConsultaCTipoPagosTrans(Integer Bandera, Integer Usucodig);
}
