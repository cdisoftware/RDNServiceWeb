package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CValoracionOfertaEntity;
import java.util.List;

public interface CValoracionOfertaService {

    public List<CValoracionOfertaEntity> ConsultaCValoracionOferta(Integer BANDERA, Integer CD_CNSCTVO);
}
