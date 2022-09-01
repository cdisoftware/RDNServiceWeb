package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.EnvioCorreo_IndividualEntity;

public interface EnvioCorreo_IndividualService {

    public String EnvioCorreoIndividual(EnvioCorreo_IndividualEntity entidad, Integer bandera, Integer IdPlantilla, Integer usucodig);
}
