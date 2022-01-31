package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CReporteAuditoriaEntity;
import java.util.List;

public interface CReporteAuditoriaService {

    public List<CReporteAuditoriaEntity> ConsultaReporteAuditoria(CReporteAuditoriaEntity entidad, String ORIGEN);

}
