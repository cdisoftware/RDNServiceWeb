package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CconductoresTransportesNuevosEntity;
import java.util.List;

public interface CconductoresTransportesNuevosService {

    public List<CconductoresTransportesNuevosEntity> ConsultaConductoresTransportes(Integer Bandera, Integer usucodigTrans, Integer CD_CNSCTVO, Integer IdSector);
}
