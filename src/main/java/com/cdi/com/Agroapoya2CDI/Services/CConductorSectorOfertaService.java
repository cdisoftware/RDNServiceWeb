package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CConductorSectorOfertaEntity;
import java.util.List;

public interface CConductorSectorOfertaService {

    public List<CConductorSectorOfertaEntity> ConsultaConductSectorOfert(Integer bandera, String CD_CNSCTVO);
}
