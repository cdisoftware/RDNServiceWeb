package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.COfertaEntity;
import java.util.List;

public interface COfertaService {

    public List<COfertaEntity> ConsultaCOferta(Integer bandera, String CD_CNSCTVO);
}
