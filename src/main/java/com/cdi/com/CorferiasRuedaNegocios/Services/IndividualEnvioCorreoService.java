package com.cdi.com.CorferiasRuedaNegocios.Services;

public interface IndividualEnvioCorreoService {

    public String EnviarCorreoIndividual(Integer bandera, Integer IdContacto, Integer IdRueda, Integer IdAgenda,
            Integer IdModulo, Integer IdEstado, String Idioma);
    
}
