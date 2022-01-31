package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CDefinirAuditoriaEntity;
import java.util.List;

public interface CDefinirAuditoriaService {

    public List<CDefinirAuditoriaEntity> ConsultaDefinirAuditoria(Integer Bandera, String Tabla, String Auditada, Integer Tipo);
}
