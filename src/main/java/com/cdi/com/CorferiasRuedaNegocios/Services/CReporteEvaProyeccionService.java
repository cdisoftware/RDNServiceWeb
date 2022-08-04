package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CReporteEvaProyeccionEntity;
import java.util.List;

public interface CReporteEvaProyeccionService {

    public List<CReporteEvaProyeccionEntity> ConsultaCReporteEvaProyeccion(Integer Bandera, Integer IdRuedaNegocio, String Nombreempresa, String Nit);
}
