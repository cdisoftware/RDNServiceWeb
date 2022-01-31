
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CAsignaPaisesEntity;
import java.util.List;


public interface CAsignaPaisesService {
    
    List<CAsignaPaisesEntity> ConsultaAsignaPaises(Integer Bandera,Integer IdUsuario, Integer IdRdn,Integer IdPerfilRueda,
            Integer IdTipoSeleccion, Integer IdAsignaPais);
}
