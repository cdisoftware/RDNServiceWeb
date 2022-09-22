package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CCalculaPrecioFinIndividualEntity;
import java.util.List;

public interface CCalculaPrecioFinIndividualService {

    public List<CCalculaPrecioFinIndividualEntity> ConsultaCalculaPrecioFinIndiv(Integer BANDERA, Integer CD_CNSCTVO, Integer ID_SCTOR_OFRTA, Integer tpo_cmsion_indvdual, Integer vlor_cmsion_indvdual);
}
