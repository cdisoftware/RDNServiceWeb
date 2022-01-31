package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.PChatEntity;
import java.util.List;

public interface PChatService {

    public List<PChatEntity> ConsultaPChat(PChatEntity entidad, Integer Bandera, String Idioma);
}
