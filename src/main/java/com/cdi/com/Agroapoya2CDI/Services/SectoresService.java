package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.SectoresEntity;
import java.util.List;

public interface SectoresService {

    public List<SectoresEntity> ConsultaSectores(Integer bandera, String NOMBRE_SECTOR, Integer CD_PAIS, Integer CD_RGION, Integer CD_MNCPIO);
}
