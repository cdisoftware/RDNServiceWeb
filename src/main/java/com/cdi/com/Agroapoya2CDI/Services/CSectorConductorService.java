package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CSectorConductorEntity;
import java.util.List;

public interface CSectorConductorService {

    public List<CSectorConductorEntity> ConsultaSectorConductor(Integer bandera, Integer cd_cnctivo);
}
