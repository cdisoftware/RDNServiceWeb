
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.PEncabezaAgendaPdfEntity;
import java.util.List;


public interface PEncabezaAgendaPdfService {
    
    public List<PEncabezaAgendaPdfEntity> ConsultaEncabezaAgendaPdf(Integer Bandera,String Idioma,Integer IdContacto, Integer IdRuedaNegocio); 
}
