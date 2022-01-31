package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CListaRolEntity;
import java.util.List;

public interface CListaRolService {

    public List<CListaRolEntity> ConsultaListaRoles(Integer Bandera);

    public String InsertarRolConsola(CListaRolEntity entidad, Integer Bandera, Integer IdUsuario);

    public String ActualizarRolConsola(CListaRolEntity entidad, Integer Bandera, Integer IdUsuario);

}
