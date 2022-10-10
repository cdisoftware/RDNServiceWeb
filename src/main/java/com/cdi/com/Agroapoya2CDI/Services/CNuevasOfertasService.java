package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CNuevasOfertasEntity;
import java.util.List;

public interface CNuevasOfertasService {

    public List<CNuevasOfertasEntity> ConsultaCNuevasOfertas(Integer Bandera, Integer Usucodig, Integer Cd_cnctvo, Integer Id_Sector);
}
