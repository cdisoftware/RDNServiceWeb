package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CVigenciaOfertaEntoty;
import java.util.List;

public interface CVigenciaOfertaService {

    public List<CVigenciaOfertaEntoty> ConsultaCVigenciaOferta(Integer BANDERA, Integer CD_CNSCTVO, Integer ID_SCTOR_OFRTA);
}
