package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CalculadoraPagosClienteEntity;
import java.util.List;

public interface CalculadoraPagosClienteService {

    public List<CalculadoraPagosClienteEntity> ConsultaCalculadoraPagosClient(CalculadoraPagosClienteEntity entidad, Integer Bandera, Integer Operacion, 
            Integer Formato, Integer Cd_Cnsctvo, Integer Id_Sector, Integer Unidades, Integer Usucodig, String CodGrupo);
}
