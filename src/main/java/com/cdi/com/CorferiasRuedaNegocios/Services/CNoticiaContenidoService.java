
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CNoticiaContenidoEntity;
import java.util.List;


public interface CNoticiaContenidoService {
    
    public List<CNoticiaContenidoEntity> ConsultaNoticiaContenido(Integer Bandera,Integer IdRueda, String Idioma);
    
    public String InsertarNoticiaContenido(CNoticiaContenidoEntity entidad, Integer Bandera, String Idioma,Integer IdUsuarioC);
    
    public String ActualizarNoticiaContenido(CNoticiaContenidoEntity entidad, Integer Bandera, String Idioma,Integer IdUsuarioC);
    
}
