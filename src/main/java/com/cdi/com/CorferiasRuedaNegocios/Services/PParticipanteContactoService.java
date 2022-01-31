
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.PParticipanteContactoEntity;
import java.util.List;


public interface PParticipanteContactoService {
    
   public List<PParticipanteContactoEntity> ConsultaParticipanteContacto(Integer Bandera,
           Integer IdParticipante,String Idioma);
}
