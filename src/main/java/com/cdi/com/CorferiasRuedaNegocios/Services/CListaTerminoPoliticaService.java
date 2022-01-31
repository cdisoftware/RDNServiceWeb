
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CListaTerminoPoliticaEntity;
import java.util.List;


public interface CListaTerminoPoliticaService {
    
    public List<CListaTerminoPoliticaEntity> ConsultaListaTerminoPolitica(String Idioma);
}
