package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CTipoTransporEntity;
import java.util.List;

public interface CTipoTransporService {

    public List<CTipoTransporEntity> ConsultaCTipoTranspor(Integer Bandera, Integer Usucodig);
}
