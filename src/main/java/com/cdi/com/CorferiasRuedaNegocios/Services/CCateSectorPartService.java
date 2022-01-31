
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CCateSectorPartEntity;
import java.util.List;


public interface CCateSectorPartService {
    
    public List<CCateSectorPartEntity> ConsultaCateSectorPart(Integer Bandera,Integer IdRueda,Integer IdSector,Integer IdParticipante);
}
