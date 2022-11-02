package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CReporteVentasEntity;
import java.util.List;

public interface CReporteVentasService {

    public List<CReporteVentasEntity> ConsultaCReporteVentas(Integer Bandera, Integer cd_cnscutivo, Integer IdSector);
}
