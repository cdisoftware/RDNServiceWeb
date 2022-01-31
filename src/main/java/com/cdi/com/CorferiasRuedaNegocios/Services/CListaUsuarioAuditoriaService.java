package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CListaUsuarioAuditoriaEntity;
import java.util.List;

public interface CListaUsuarioAuditoriaService {

    public List<CListaUsuarioAuditoriaEntity> ConsultaUsuarioAudit(Integer Bandera, String USUARIO);

}
