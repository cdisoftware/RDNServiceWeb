package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CReporteSectorCatSubEntity;
import java.util.List;

public interface CReporteSectorCatSubService {

    public List<CReporteSectorCatSubEntity> ReporteSectorCatSub(Integer Bandera, Integer IdSector, Integer IdCategoria,
            Integer IdSubCategoria, String NombreSector, String NombreCategoria, String NombreSubCategoria, Integer IdRueda, Integer IdPerfil);
}
