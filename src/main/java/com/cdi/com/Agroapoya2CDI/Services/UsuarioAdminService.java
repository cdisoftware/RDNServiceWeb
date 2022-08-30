package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.UsuarioAdminEntity;
import java.util.List;

public interface UsuarioAdminService {

    public List<UsuarioAdminEntity> ConsultaUserAdmin(UsuarioAdminEntity entidad, Integer Bandera);
}
