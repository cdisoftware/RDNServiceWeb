
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CSectorPartEntity;
import java.util.List;


public interface CSectorPartService {
 
    public List<CSectorPartEntity> ConsultaSectorPart(Integer Bandera,Integer IdRueda,String Sector,String Participante,String Nit);
}
