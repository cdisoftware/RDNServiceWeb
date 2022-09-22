package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CCalculaPrecioFinGrupalEntity;
import java.util.List;

public interface CCalculaPrecioFinGrupalService {

    public List<CCalculaPrecioFinGrupalEntity> ConsultaCCalculaPrecioFinGrupal(Integer BANDERA, Integer CD_CNSCTVO,
            Integer ID_SCTOR_OFRTA, Integer tpo_cmsion_grupal, Integer vlor_cmsion_grupal, Integer vlor_dmcilio_grupal, Integer mnmo_prsnas_xgrupo);
}
