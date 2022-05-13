package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.PCitasAgendaPdfMasivoEntity;
import java.util.List;

public interface PCitasAgendaPdfMasivoService {

    public List<PCitasAgendaPdfMasivoEntity> ConsultaPCitasAgendaPDFmasivo(Integer IdProceso);
}
