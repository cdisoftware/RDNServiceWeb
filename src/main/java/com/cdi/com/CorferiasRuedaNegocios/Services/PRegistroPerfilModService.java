
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.PRegistroPerfilModEntity;


public interface PRegistroPerfilModService {
    
    public String InsertarRegistroPerfil(PRegistroPerfilModEntity entidad,Integer Bandera,Integer IdUsuario);
    
    public String InsertaRelacionContactoMod(PRegistroPerfilModEntity entidad, Integer Bandera, Integer IdUsuario);
}
