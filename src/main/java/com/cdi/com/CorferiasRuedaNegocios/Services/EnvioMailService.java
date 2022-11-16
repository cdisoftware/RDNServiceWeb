
package com.cdi.com.CorferiasRuedaNegocios.Services;



public interface EnvioMailService {

    public String EnviarCorreo(Integer bandera, String Idioma, Integer IdEnvioCorreo);
    public String EnviarCorreoCancela(Integer bandera, String Idioma, Integer IdContacto, Integer IdRueda);
}
