package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CparticipanteGrupoEntity;
import java.util.List;

public interface CparticipanteGrupoService {

    public List<CparticipanteGrupoEntity> ConsultaCParticipanteGrupo(Integer Bandera, Integer IdGrupo, Integer Usucodig);
}
