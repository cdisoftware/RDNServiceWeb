package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CultimaUbicacionEntity;
import java.util.List;

public interface CultimaUbicacionService {

    public List<CultimaUbicacionEntity> ConsultaUltimaUbicacion(Integer bandera, 
            Integer cd_cnscutivo, Integer idConductor, Integer IdSector);
}
