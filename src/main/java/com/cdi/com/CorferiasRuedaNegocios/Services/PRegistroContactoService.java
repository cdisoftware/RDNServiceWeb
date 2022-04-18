
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.PRegistroContactoEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.PRegistroContactoModEntity;
import java.util.List;


public interface PRegistroContactoService {
    
    public String ConsultaRegistroContacto(Integer Bandera,String Idioma, Integer IdContacto);
    
    public String InsertarRegistroContacto(PRegistroContactoModEntity entidad, Integer Bandera, Integer IdUsuario);
    
    public String ActualizarRegistroContacto(PRegistroContactoModEntity entidad, Integer Bandera, Integer IdUsuario);
}
