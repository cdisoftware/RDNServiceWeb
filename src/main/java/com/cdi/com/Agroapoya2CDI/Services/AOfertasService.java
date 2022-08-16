package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.AOfertasEntity;
import java.util.List;

public interface AOfertasService {

    public List<AOfertasEntity> ConsultaAOfertas(AOfertasEntity entidad, Integer Bandera, Integer cnctivoOferta, Integer id_prdcto, Integer idProductor);
}
