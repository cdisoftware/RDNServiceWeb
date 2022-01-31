
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CRepRespuestasGeneralEntity;
import java.util.List;


public interface CRepRespuestasGeneralService {
    
    public List<CRepRespuestasGeneralEntity> ConsultaRepRespuestasGen( Integer Bandera, Integer IdEvaluacion, Integer IdContacto, Integer IdRuedaNegocio, String NombreRdn, 
            Integer TipoEva, String Nombreempresa, String Nit, Integer IdTipoPerfil);
    
}
