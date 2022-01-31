package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CPermisosRolEntity;
import java.util.List;

public interface CPermisosRolService {

    public List<CPermisosRolEntity> ConsultaPermisosRol(Integer bandera, Integer IdRol, String NombreRol);

    public String InsertarPermisosRolConsola(CPermisosRolEntity entidad, Integer Bandera,
            Integer IdUsuario);

    public String ActualizarPermisosRolConsola(CPermisosRolEntity entidad, Integer Bandera,
            Integer IdUsuario);
}
