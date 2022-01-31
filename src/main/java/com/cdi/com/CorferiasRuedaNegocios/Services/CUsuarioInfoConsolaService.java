package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CUsuarioInfoConsolaEntity;
import com.cdi.com.CorferiasRuedaNegocios.Entity.EncriptacionEntity;

public interface CUsuarioInfoConsolaService {

    public String ConsultaUsuarioInfo(CUsuarioInfoConsolaEntity entity);
    
    public String InsertarRelUsuarioRol(CUsuarioInfoConsolaEntity entity, Integer Bandera,Integer IdUsuario);
    
    public String ActualizarRelUsuarioRol(CUsuarioInfoConsolaEntity entity, Integer Bandera,Integer IdUsuario);

    public String Clave(EncriptacionEntity entidad);
}
