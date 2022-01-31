
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CContactoContenidoEntity;
import java.util.List;


public interface CContactoContenidoService {
    
    public List<CContactoContenidoEntity>ConsultaContactoContenido(Integer Bandera,Integer IdRueda);
    
    public String InsertarContactoContenido(CContactoContenidoEntity entidad, Integer Bandera,String Idioma,Integer IdUsuarioC);
    
    public String ActualizarContactoContenido(CContactoContenidoEntity entidad, Integer Bandera,String Idioma,Integer IdUsuarioC);
    
}
