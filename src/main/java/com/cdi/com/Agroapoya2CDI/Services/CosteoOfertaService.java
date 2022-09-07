package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CosteoOfertaEntity;
import java.util.List;

public interface CosteoOfertaService {

    public List<CosteoOfertaEntity> ConsultaCosteoOferta(Integer bandera, String CD_CNSCTVO);
}
