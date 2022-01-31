package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CChatEntity;
import java.util.List;

public interface CChatService {

    public List<CChatEntity> ConsultaChat(Integer Bandera,String Idioma,Integer RuedaNegocio, Integer IdRuedaNegocio,Integer TipoChat, 
            Integer IdJornada, Integer IdChat);

    public String InsertarChat(CChatEntity entidad, Integer Bandera, String Idioma,Integer IdUsuario);

    public String ActualizarChat(CChatEntity entidad, Integer Bandera, String Idioma,Integer IdUsuario);
}
