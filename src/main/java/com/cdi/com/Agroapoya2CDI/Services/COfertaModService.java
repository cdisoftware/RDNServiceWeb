package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.COfertaModEntity;

public interface COfertaModService {

    public String InsertaCOfertaMod(COfertaModEntity entidad, Integer bandera, String ID_EMPAQUE);

    public String ActualizaCOfertaMod(COfertaModEntity entidad, Integer bandera, String ID_EMPAQUE);
}
