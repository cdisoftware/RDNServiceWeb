package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CRelacionGrupoClienteEntity;

public interface CRelacionGrupoClienteService {

    public String InsertaCRelacGrupoClient(CRelacionGrupoClienteEntity entidad, Integer Bandera);

    public String EliminaCRelacGrupoClient(CRelacionGrupoClienteEntity entidad, Integer Bandera);
}
