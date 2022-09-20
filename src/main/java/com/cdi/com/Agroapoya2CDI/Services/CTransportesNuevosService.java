package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CTransportesNuevosEntity;
import java.util.List;

public interface CTransportesNuevosService {

    public List<CTransportesNuevosEntity> ConsultaCTransportesNuevos(Integer Bandera, Integer usucodigTrans, Integer id_conductor);
}
