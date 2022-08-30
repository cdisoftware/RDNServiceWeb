package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.EnvioCorreo_IndividualEntity;

public interface EnvioCorreo_IndividualService {

    public String EnvioCorreoIndividual(Integer bandera, Integer IdPlantilla, Integer usucodig, String correoPersona);
}
