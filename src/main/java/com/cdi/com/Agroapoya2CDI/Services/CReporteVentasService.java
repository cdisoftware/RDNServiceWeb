package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CReporteVentasEntity;
import java.util.List;

public interface CReporteVentasService {

    public List<CReporteVentasEntity> ConsultaCReporteVentas(CReporteVentasEntity entidad, Integer Bandera, Integer ID_CNDCTOR, Integer id_Sector);
}
