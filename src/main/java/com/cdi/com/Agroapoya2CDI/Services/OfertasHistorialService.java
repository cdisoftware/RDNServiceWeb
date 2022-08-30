package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.OfertasHistorialEntity;
import java.util.List;

public interface OfertasHistorialService {

    public List<OfertasHistorialEntity> ConsultaOfertasCarritoCompras(OfertasHistorialEntity entidad, Integer Bandera, Integer cnctivoOferta, Integer id_prdcto);
}
