package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.TransActivosEntity;
import java.util.List;

public interface TransActivosService {

    public List<TransActivosEntity> ConsultaTrascActivos(Integer bandera, Integer id_condutor, Integer usucodigTrans);
}
