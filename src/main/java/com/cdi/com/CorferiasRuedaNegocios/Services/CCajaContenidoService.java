
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CCajaContenidoEntity;
import java.util.List;


public interface CCajaContenidoService {
    
    public List<CCajaContenidoEntity>ConsultarCajaContenido(Integer Bandera,Integer IdRueda,String Idioma);
    
    public String InsertarCajaContenido(CCajaContenidoEntity entidad, Integer Bandera, String Idioma, Integer IdUsuarioC);
    
    public String ActualizarCajaContenido(CCajaContenidoEntity entidad, Integer Bandera, String Idioma, Integer IdUsuarioC);
}
