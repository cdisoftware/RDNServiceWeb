package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CtableroEntity;
import java.util.List;

public interface CtableroService {

    public List<CtableroEntity> ConsultaCTablero(Integer Bandera, Integer UsucodigTrans, Integer IdConductor, Integer IdPlataforma);
}
