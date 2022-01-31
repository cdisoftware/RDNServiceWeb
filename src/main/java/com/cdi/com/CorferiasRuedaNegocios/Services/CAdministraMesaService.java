
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CAdministraMesaEntity;
import java.util.List;


public interface CAdministraMesaService {
    
    public List<CAdministraMesaEntity> ConsultarAdministrarMesa(Integer bandera,String Idioma,Integer IdRuedaNegocio);
    
    public String InsertarAdministraMesa(CAdministraMesaEntity entidad, Integer bandera, String Idioma);
    
    public String ActualizarAdministraMesa(CAdministraMesaEntity entidad, Integer bandera, String Idioma);
}
