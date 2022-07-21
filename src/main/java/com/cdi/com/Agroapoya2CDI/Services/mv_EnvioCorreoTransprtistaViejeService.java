package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.mv_EnvioCorreoTransprtistaViejeEntity;
import java.util.List;

public interface mv_EnvioCorreoTransprtistaViejeService {

    public List<mv_EnvioCorreoTransprtistaViejeEntity> ConsultaEnvioCorreoTransptsta(Integer id_trans, Integer consecutico);
}
