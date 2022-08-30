package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.OfertasCarritoComprasEntity;
import java.util.List;

public interface OfertasCarritoComprasService {

    public List<OfertasCarritoComprasEntity> ConsultaOfertasCarritoCompras(OfertasCarritoComprasEntity entidad, Integer Bandera, Integer cnctivoOferta, Integer id_prdcto);
}
