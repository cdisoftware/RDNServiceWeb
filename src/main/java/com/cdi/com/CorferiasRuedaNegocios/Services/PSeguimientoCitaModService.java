package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.PSeguimientoCitaModEntity;

public interface PSeguimientoCitaModService {

    public String InsertaPSegCita(PSeguimientoCitaModEntity entidad, Integer bandera);

    public String ActualizaPSegCita(PSeguimientoCitaModEntity entidad, Integer bandera);
}
