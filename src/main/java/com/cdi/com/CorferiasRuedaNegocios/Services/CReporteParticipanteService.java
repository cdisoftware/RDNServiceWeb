package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CReporteParticipanteEntity;
import java.util.List;

public interface CReporteParticipanteService {

    public List<CReporteParticipanteEntity> ConsultaReporteParticipante(Integer Bandera, Integer IdParticipante, String NombreParticipante, Integer IdPerfil, String NombreRdn, String FechaRegistro, Integer IdRdn);
}
