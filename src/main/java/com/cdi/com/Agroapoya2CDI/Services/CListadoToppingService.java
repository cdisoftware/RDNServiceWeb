package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CListadoToppingEntity;
import java.util.List;

public interface CListadoToppingService {

    public List<CListadoToppingEntity> ConsultaCListadoTopping(Integer Bandera, Integer Id_Sector, Integer cd_cnctivo);
}
