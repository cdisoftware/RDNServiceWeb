
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CMascaraEntity;
import java.util.List;


public interface CMascaraService {
    
    public List<CMascaraEntity> ConsultaMascara(Integer Bandera, String Idioma);
    
    public String ActualizarMascara(CMascaraEntity entidad, Integer Bandera, String Idioma);
}
