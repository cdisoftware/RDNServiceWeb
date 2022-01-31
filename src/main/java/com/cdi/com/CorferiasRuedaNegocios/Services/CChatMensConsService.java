
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CChatMensConsEntity;
import java.util.List;

public interface CChatMensConsService {
   
    public List<CChatMensConsEntity> ConsultaChatMensCons(Integer Bandera, Integer IdContactoC, Integer IdContactoP, Integer IdSoporte,
            String Participante, String NoDocPart, String Usuario, String Fecha, Integer Estado, Integer EstadoC);
}
