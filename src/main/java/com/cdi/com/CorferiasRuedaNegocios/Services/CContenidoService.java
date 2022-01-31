
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CContenidoEntity;
import java.util.List;


public interface CContenidoService {
    
    public List<CContenidoEntity>ConsultaContenido(Integer Bandera, Integer IdRueda,
            String Idioma, String Contenido);
    
    public String InsertarContenido(CContenidoEntity entidad, Integer Bandera, String Idioma);
    
    public String ActualizarContenido(CContenidoEntity entidad, Integer Bandera, String Idioma);
}
