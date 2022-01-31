
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CSubCatePartEntity;
import java.util.List;


public interface CSubCatePartService {
    
    public List<CSubCatePartEntity> ConsultarSubCatePart(Integer Bandera,Integer IdRueda,
            Integer IdCategoria,Integer IdSubCategoria,Integer IdParticipante);
}
