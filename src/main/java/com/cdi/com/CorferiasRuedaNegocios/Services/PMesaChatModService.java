
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.PMesaChatModEntity;


public interface PMesaChatModService {
    
    public String InsertarMesaChat(PMesaChatModEntity entidad, Integer bandera, Integer Estado, Integer IdSala);
    
    public String ActualizarMesaChat(PMesaChatModEntity entidad, Integer bandera, Integer Estado, Integer IdSala);
}
