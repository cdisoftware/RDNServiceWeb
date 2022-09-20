package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CDocumentoCorreoEntity;
import java.util.List;

public interface CDocumentoCorreoService {

    public List<CDocumentoCorreoEntity> ConsultaCDocumentoCorreo(Integer Bandera, Integer IdPlantilla);
}
