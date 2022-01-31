
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CFormulaPlantillaModEntity;


public interface CFormulaPlantillaModService {
    
    public String InsertarPlantillaCorreo(CFormulaPlantillaModEntity entidad, Integer bandera, String Idioma);
    
    public String ActualizarPlantillaCorreo(CFormulaPlantillaModEntity entidad, Integer bandera, String Idioma);
}
