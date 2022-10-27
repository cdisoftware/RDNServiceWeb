package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CReporteUsuariosEntity;
import java.util.List;

public interface CReporteUsuarioService {

    public List<CReporteUsuariosEntity> ConsultaCReporteUsuario(CReporteUsuariosEntity entidad, Integer Bandera);
}
