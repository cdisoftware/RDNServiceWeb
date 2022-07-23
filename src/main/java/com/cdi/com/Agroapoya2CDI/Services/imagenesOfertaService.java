package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.imagenesOfertaEntity;
import java.util.List;

public interface imagenesOfertaService {

    public List<imagenesOfertaEntity> ConsultaImageOferta(Integer Bandera, Integer cd_cnsctivo);
}
