
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CCiudadDptoEntity;
import java.util.List;


public interface CCiudadDptoService {
    
    public List<CCiudadDptoEntity> ConsultaCiudadDepto(Integer IdPais,String IdDpto);
}
