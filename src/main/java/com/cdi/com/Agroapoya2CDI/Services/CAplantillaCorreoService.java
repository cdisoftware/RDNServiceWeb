package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CAplantillaCorreoEntity;
import java.util.List;

public interface CAplantillaCorreoService {

    public List<CAplantillaCorreoEntity> ConsultaAplantillaCorreo(CAplantillaCorreoEntity entidad, Integer Bandera);
}
