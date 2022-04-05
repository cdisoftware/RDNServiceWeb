package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.PSeguimientoCitaEntity;
import java.util.List;

public interface PSeguimientoCitaService {

    public List<PSeguimientoCitaEntity> ConsultaPSegCita(Integer bandera, Integer IdRuedaNegocio, String FechaCita);

}
