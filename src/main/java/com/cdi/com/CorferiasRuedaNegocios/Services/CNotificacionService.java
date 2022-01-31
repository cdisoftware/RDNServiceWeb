
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CNotificacionEntity;
import java.util.List;


public interface CNotificacionService {
    
    public List<CNotificacionEntity> ConsultaNotificacionesC(CNotificacionEntity entidad, Integer bandera,String Idioma,String NombreRueda,
            Integer IdRueda,Integer TipoPerfil,Integer IdSector,Integer Estado,
            Integer Publicar,String TituloNoti, Integer IdNotifica);
    
    public String InsertarNotificacionesC(CNotificacionEntity entidad, Integer bandera,String Idioma,Integer IdUsuario);
    
    public String ActualizarNotificacionesC(CNotificacionEntity entidad, Integer bandera,String Idioma,Integer IdUsuario);
    
   
    
}


