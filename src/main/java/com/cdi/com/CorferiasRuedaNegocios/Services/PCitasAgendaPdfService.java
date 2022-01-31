
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.PCitasAgendaPdfEntity;
import java.util.List;


public interface PCitasAgendaPdfService {
    
    public List<PCitasAgendaPdfEntity> ConsultaCitasAgendaPdf(Integer Bandera,String Idioma,Integer IdContacto,Integer IdRuedaNegocio);
}
