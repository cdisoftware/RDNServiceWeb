
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.PPerfilRuedaNegocioEntity;
import java.util.List;


public interface PPerfilRuedaNegocioService {
    
    public List<PPerfilRuedaNegocioEntity> ConsultaRuedaNegocio(Integer Bandera,String Idioma,Integer Idparticipante, Integer IdRuedaNegocio);
    
}
