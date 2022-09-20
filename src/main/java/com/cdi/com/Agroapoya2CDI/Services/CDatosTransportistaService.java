package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CDatosTransportistaEntity;
import java.util.List;

public interface CDatosTransportistaService {

    public List<CDatosTransportistaEntity> ConsultaCDatosTransportista(Integer bandera, String usucodig);
}
