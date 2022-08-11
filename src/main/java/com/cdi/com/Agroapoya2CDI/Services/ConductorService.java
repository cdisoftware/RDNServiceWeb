package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.ConductorEntity;
import java.util.List;

public interface ConductorService {

    public List<ConductorEntity> ConsultaConductor(ConductorEntity entidad, Integer bandera, Integer Cd_cnsctivo, Integer CODIGO_TRANS, Integer CD_PAIS, Integer CD_RGION, Integer CD_MNCPIO);
}
