package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.TSubMenuEntity;
import java.util.List;

public interface TSubMenuService {

    public List<TSubMenuEntity> ConsultaTSubMenu(Integer Bandera, Integer IdTipoUsuario, Integer Usucodig);
}
