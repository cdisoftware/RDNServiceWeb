
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CListaPlantillaCorreoEntity;
import java.util.List;


public interface CListaPlantillaCorreoService {

    public List<CListaPlantillaCorreoEntity> ConsultaListaPlantillaCorreo(Integer bandera,Integer IdPlantilla,String NombrePlantilla);
}
