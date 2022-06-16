package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CGrupoClienteEntity;

public interface CGrupoClienteService {

    public String InsertCGrupCliente(CGrupoClienteEntity entidad, Integer Bandera);

    public String EliminaCGrupCliente(CGrupoClienteEntity entidad, Integer Bandera);
}
