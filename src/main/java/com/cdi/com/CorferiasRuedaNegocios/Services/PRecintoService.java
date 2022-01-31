
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.PRecintoEntity;
import java.util.List;


public interface PRecintoService {
    
    public List<PRecintoEntity> ConsultaRecintoP(Integer bandera,Integer IdRueda, String Idioma);
}
