
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CCamposParticipanteEntity;
import java.util.List;


public interface CCamposParticipanteService {
    
    public List<CCamposParticipanteEntity> ConsultaCamposParticipante(Integer Bandera, Integer IdRdn);
    
    public String InsertarCamposParticipante(CCamposParticipanteEntity entidad, Integer Bandera);
    
    public String ActualizarCamposParticipante(CCamposParticipanteEntity entidad, Integer Bandera);
}
