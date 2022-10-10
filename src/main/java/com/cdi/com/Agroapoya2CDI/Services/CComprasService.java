package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CComprasEntity;
import java.util.List;

public interface CComprasService {

    public List<CComprasEntity> ConsultaCCompras(Integer Bandera, Integer Usucodig, Integer Cd_cnsctivo, Integer Id_cliente);
}
