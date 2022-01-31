
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CTerminoPoliticaEntity;
import java.util.List;


public interface CTerminoPoliticaService {
    
    public List<CTerminoPoliticaEntity>ConsultaTerminoPolitica(Integer TipoDoc,Integer IdRueda,String Idioma,Integer IdTerminoPolitica);
    
}
