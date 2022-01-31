
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CListaFiltrosEntity;
import java.util.List;


public interface CListaFiltrosService {
    
    public List<CListaFiltrosEntity> ConsultaFiltros(Integer Bandera);
}
