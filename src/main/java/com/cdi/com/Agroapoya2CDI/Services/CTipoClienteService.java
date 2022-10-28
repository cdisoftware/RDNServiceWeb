package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CTipoClienteEntity;
import java.util.List;

public interface CTipoClienteService {

    public List<CTipoClienteEntity> ConsultaCTipoCliente(Integer Bandera, Integer Usucodig);
}
