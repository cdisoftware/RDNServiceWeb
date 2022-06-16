package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.mv_infoBasicaUsuarioEntity;
import java.util.List;

public interface mv_infoBasicaUsuarioService {

    public List<mv_infoBasicaUsuarioEntity> ConsultaInfoBascUser(mv_infoBasicaUsuarioEntity entidad, Integer bandera);
}
