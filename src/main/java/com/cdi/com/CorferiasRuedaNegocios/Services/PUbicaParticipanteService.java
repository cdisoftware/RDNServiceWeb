
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.PUbicaParticipanteEntity;
import java.util.List;


public interface PUbicaParticipanteService {
    
    public List<PUbicaParticipanteEntity> ConsultaUbicaParticipante(Integer Bandera,Integer IdParticipante, Integer IdRdn);

    String InsertarUbicaParticipante(PUbicaParticipanteEntity entidad, Integer Bandera);
    
    String ActualizarUbicaParticipante(PUbicaParticipanteEntity entidad, Integer Bandera);
}
