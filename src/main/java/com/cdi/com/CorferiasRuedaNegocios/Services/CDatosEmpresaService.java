package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CDatosEmpresaEntity;
import java.util.List;

public interface CDatosEmpresaService {

    public List<CDatosEmpresaEntity> ConsultaDatosEmpresa(Integer Bandera, Integer IdRueda, String Participante, 
            String NoIdentificacion, Integer IdParticipante);
}
