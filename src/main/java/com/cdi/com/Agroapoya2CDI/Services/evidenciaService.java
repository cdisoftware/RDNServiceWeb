package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.evidenciaEntity;
import java.util.List;

public interface evidenciaService {

    public List<evidenciaEntity> ConsultaEvidencia(Integer bandera, Integer id_evidencia, Integer id_factura);
}
