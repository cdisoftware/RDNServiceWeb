package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.COfertasNuevasEntity;
import java.util.List;

public interface COfertasNuevasService {

    public List<COfertasNuevasEntity> ConsultaOfertasNuevas(COfertasNuevasEntity entidad, Integer Bandera, Integer cnctivoOferta, Integer id_prdcto);
}
