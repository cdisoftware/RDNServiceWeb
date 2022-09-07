package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.loginTransEntity;
import java.util.List;

public interface loginTransService {

    public List<loginTransEntity> ConsultaLoginTransportista(loginTransEntity entidad, Integer bandera);
}
