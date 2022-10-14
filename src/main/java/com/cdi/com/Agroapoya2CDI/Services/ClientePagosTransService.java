package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.ClientePagosTransEntity;
import java.util.List;

public interface ClientePagosTransService {

    public List<ClientePagosTransEntity> ConsultaClientePagosTrans(Integer Bandera, Integer Cd_csnctivo, Integer IdSector, Integer idConductor);

}
