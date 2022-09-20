package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CCordenadasSectorEntity;
import java.util.List;

public interface CCordenadasSectorService {

    public List<CCordenadasSectorEntity> ConsultaCordenadasSector(Integer BANDERA, Integer ID_SCTOR_OFRTA);
}
