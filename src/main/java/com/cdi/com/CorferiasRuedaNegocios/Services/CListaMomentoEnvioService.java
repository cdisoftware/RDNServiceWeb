
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CListaMomentoEnvioEntity;
import java.util.List;


public interface CListaMomentoEnvioService {
    
    public List<CListaMomentoEnvioEntity> ConsultaListaMomentoEnvio(Integer bandera,Integer IdEstadoCita,String Descripcion);
}
