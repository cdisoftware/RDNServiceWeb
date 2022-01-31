package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CUsuarioConsModEntity;
import java.util.List;

public interface CUsuarioConsModService {

    public List<CUsuarioConsModEntity> ConsultaUsuarioConsola(Integer Bandera, Integer Idusuario,
            Integer Estado, Integer IdRol, Integer IdUsuarioCons, String NombreUsuario);

    public String InsertarUsuarioConsMod(CUsuarioConsModEntity entidad, Integer Bandera, Integer Idusuario);

    public String ActualizarUsuarioConsMod(CUsuarioConsModEntity entidad, Integer Bandera, Integer Idusuario);

}
