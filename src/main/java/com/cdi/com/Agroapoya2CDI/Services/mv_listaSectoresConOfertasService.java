package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.mv_listaSectoresConOfertasEntity;
import java.util.List;

public interface mv_listaSectoresConOfertasService {

    public List<mv_listaSectoresConOfertasEntity> ConsultaListSctorsOferts(Integer bandera, Integer ciudad);
}
