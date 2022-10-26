package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.entregasConductorEntity;
import java.util.List;

public interface entregasConductorService {

    public List<entregasConductorEntity> ConsultaEntregasConductor(Integer bandera, Integer ID_CNDCTOR, Integer id_Sector, Integer cd_cnctivo);
}
