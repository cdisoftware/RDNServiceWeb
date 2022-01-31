
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CListaPerfilRdnEntity;
import java.util.List;


public interface CListaPerfilRdnService {
    
    public List<CListaPerfilRdnEntity> ConsultaListaPerfil(Integer bandera,String Idioma,
            Integer IdUsuario,Integer IdRdn, Integer IdParticipante);
    
}
