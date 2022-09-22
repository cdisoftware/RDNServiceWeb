package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CPersonaTransEntity;
import java.util.List;

public interface CPersonaTransService {

    public List<CPersonaTransEntity> ConsultaCPersonaTrans(Integer bandera, Integer usucodig, Integer id_conductor);
}
