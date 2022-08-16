package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CSectorOfertaEntity;
import java.util.List;

public interface CSectorOfertaService {

    public List<CSectorOfertaEntity> ConsultaCSectorOferta(Integer bandera, Integer CD_CNSCTVO);
}
