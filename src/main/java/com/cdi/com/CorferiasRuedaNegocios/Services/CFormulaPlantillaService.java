
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CFormulaPlantillaEntity;
import java.util.List;


public interface CFormulaPlantillaService {
    
    public List<CFormulaPlantillaEntity> ConsultaFormulaPlantilla(Integer bandera,
            Integer IdPlantilla,Integer IdFormula,String Idioma);
}
