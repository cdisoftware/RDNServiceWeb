package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CConductorCondEntity;
import java.util.List;

public interface CConductorCondService {

    public List<CConductorCondEntity> ConsultaCConductorCond(Integer bandera, Integer id_conductor);
}
