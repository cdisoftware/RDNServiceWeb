package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CConductorEntity;
import java.util.List;

public interface CConductorService {

    public List<CConductorEntity> ConsultaCConductor(CConductorEntity entidad, Integer bandera);
}
