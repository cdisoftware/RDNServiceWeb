package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CMisToppingsEntity;
import java.util.List;

public interface CMisToppingsService {

    public List<CMisToppingsEntity> ConsultaCMisToppings(Integer Bandera, Integer IdCliente);
}
