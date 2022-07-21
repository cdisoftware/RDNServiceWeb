package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.MV_AGRO_VALIDACODIGOEntity;
import java.util.List;

public interface MV_AGRO_VALIDACODIGOService {

    public List<MV_AGRO_VALIDACODIGOEntity> ConsultaAgroValidaCod(Integer BANDERA, Integer CODIGO, String CODIGODOS, Integer UNIDADES);
}
