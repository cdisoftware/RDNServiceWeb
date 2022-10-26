package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CAgroTipoNovedadEntity;
import java.util.List;

public interface CAgroTipoNovedadService {

    public List<CAgroTipoNovedadEntity> ConsultaCAgroTipoNovedad(Integer Bandera, Integer IdNovedad);

}
