
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CMascaraContenidoEntity;
import java.util.List;


public interface CMascaraContenidoService {
    
    public List<CMascaraContenidoEntity>ConsultaMascaraContenido(Integer Bandera,Integer IdRueda,String Idioma);
    
    public String InsertarMascaraContenido(CMascaraContenidoEntity entidad, Integer Bandera,String Idioma, Integer IdUsuarioC);
    
    public String ActualizarMascaraContenido(CMascaraContenidoEntity entidad, Integer Bandera,String Idioma, Integer IdUsuarioC);
    
}
