package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CConsultaEstadoOfertaEntity;
import java.util.List;

public interface CConsultaEstadoOfertaService {

    public List<CConsultaEstadoOfertaEntity> ConsultaCEstadoOferta(Integer bandera, String CD_CNSCTVO);
}
