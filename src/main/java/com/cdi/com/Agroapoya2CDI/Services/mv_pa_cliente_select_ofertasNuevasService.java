package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.mv_pa_cliente_select_ofertasNuevasEntity;
import java.util.List;

public interface mv_pa_cliente_select_ofertasNuevasService {

    public List<mv_pa_cliente_select_ofertasNuevasEntity> ConsultaClientOfertNew(Integer US_CLIENTE, Integer TIPOCOMPRA, String NOMBRE, Integer ID_SECTOR, Integer CD_MNCPIO);
}
