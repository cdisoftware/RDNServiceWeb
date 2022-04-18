package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CReporteAccesoSalasEntity;
import java.util.List;

public interface CReporteAccesoSalasService {

    public List<CReporteAccesoSalasEntity> ConsultaCReportAcceSala(Integer Bandera, Integer IdRuedaNegocio, Integer IdParticipante, String FechaCitaIni, String FechaCitaFin, Integer IdEstadoRealizaCita);
}
