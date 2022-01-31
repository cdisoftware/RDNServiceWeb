package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.PMesaChatMensModEntity;

public interface PMesaChatMensModService {

    public String InsertarChatMensMod(PMesaChatMensModEntity entidad, Integer bandera, Integer Id);

    public String ActualizarChatMensMod(PMesaChatMensModEntity entidad, Integer bandera, Integer Id);

}
