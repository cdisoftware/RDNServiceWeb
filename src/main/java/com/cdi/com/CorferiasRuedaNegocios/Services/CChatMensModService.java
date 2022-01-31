package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CChatMensModEntity;

public interface CChatMensModService {

    public String InsertarCChatMensMod(CChatMensModEntity entidad, Integer bandera);

    public String ActualizarCChatMensMod(CChatMensModEntity entidad, Integer bandera);
}
