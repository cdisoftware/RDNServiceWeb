package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.menuEntity;
import java.util.List;

public interface menuService {

    public List<menuEntity> ConsultaMenu(Integer Bandera, Integer IdTipoUsuario, Integer Usucodig);
}
