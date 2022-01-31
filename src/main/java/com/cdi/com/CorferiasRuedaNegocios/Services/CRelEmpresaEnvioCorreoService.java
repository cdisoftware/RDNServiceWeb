package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CRelEmpresaEnvioCorreoEntity;
import java.util.List;

public interface CRelEmpresaEnvioCorreoService {

    public List<CRelEmpresaEnvioCorreoEntity> ConsultaRelacionEnvioCorreo(Integer Bandera, 
            String Participante, Integer IdParticipante, Integer IdEnvioCorreo);

    public String InsertarRelacionEnvioCorreo(CRelEmpresaEnvioCorreoEntity entidad, 
            Integer Bandera);

    public String EliminarRelacionEnvioCorreo(CRelEmpresaEnvioCorreoEntity entidad,
            Integer Bandera);
}
