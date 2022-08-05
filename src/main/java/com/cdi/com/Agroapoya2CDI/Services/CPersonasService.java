package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CPersonasEntity;
import java.util.List;

public interface CPersonasService {

    public List<CPersonasEntity> ConsultaCPersonas(CPersonasEntity entidad, Integer bandera, String TipoPersona);
}
