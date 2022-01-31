
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CUsuarioConsultaRolesEntity;
import java.util.List;


public interface CUsuarioConsultaRolesService {
    
    public List <CUsuarioConsultaRolesEntity> ConsultaRoles(Integer Bandera, Integer Idusuario);
}
