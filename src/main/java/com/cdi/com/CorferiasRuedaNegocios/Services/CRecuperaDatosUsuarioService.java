package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CRecuperaDatosUsuarioEntity;
import java.util.List;

public interface CRecuperaDatosUsuarioService {

    public List<CRecuperaDatosUsuarioEntity> ConsultaCRecDatosUser(CRecuperaDatosUsuarioEntity entidad, Integer Bandera, Integer IdUsuario);
}
