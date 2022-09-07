package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.loginClienteEntity;
import java.util.List;

public interface loginClienteService {

    public List<loginClienteEntity> ConsultaLoginCliente(loginClienteEntity entidad, Integer bandera);
}
