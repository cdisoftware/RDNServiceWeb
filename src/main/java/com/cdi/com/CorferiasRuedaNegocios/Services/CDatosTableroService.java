
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CDatosTableroEntity;
import java.util.List;


public interface CDatosTableroService {
    
    public List<CDatosTableroEntity> ConsultaDatosTablero(Integer Bandera,String NombreCaja,
            Integer IdGrupo, Integer IdCaja, Integer estado);
    
    public String InsertarDatosTablero(CDatosTableroEntity entidad,Integer Bandera,Integer IdUsuarioC);
    
    public String ActualizarDatosTablero(CDatosTableroEntity entidad,Integer Bandera,Integer IdUsuarioC);
    
}
