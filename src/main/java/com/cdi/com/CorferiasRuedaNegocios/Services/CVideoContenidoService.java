
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CVideoContenidoEntity;
import java.util.List;


public interface CVideoContenidoService {
    
    public List<CVideoContenidoEntity> ConsultaVideoContenido(Integer Bandera,Integer IdRueda,String Idioma);
    
    public String InsertarVideoContenido(CVideoContenidoEntity entidad, Integer Bandera, String Idioma);
    
    public String ActualizarVideoContenido(CVideoContenidoEntity entidad, Integer Bandera, String Idioma);
}
