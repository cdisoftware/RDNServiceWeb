package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CReporteEvaEncEntity;
import java.util.List;

public interface CReporteEvaEncService {

    public List<CReporteEvaEncEntity> ReporteEvaEncService(Integer Bandera, Integer IdRuedaNegocio,
            String NombreRdn, Integer TipoEva, String Nombreempresa, String Nit, Integer IdTipoPerfil, Integer IdEvaluacion);
}
