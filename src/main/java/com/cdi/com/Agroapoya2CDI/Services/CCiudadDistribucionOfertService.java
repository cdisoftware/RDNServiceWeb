package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CCiudadDistribucionOfertEntity;
import java.util.List;

public interface CCiudadDistribucionOfertService {

    public List<CCiudadDistribucionOfertEntity> ConsultaCCiudadDistcionOferta(Integer bandera, String CD_CNSCTVO);
}
