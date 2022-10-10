package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CUnidadesDisponiblesListaEntity;
import java.util.List;

public interface CUnidadesDisponiblesListaService {

    public List<CUnidadesDisponiblesListaEntity> ConsultaUnidadesDisponiblesList(Integer Bandera, Integer Usucodig, Integer Cd_csctvo, Integer Id_Sector);
}
