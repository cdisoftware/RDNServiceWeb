package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CUnidadesDisponiblesEntity;
import java.util.List;

public interface CUnidadesDisponiblesService {

    public List<CUnidadesDisponiblesEntity> ConsultaCUnidadesDisponibles(Integer Bandera, Integer Usucodig, Integer Cd_csctvo, Integer Id_Sector);
}
