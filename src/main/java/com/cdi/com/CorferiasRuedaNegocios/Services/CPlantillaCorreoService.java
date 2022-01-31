
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CPlantillaCorreoEntity;
import java.util.List;


public interface CPlantillaCorreoService {
    
    public List<CPlantillaCorreoEntity> ConsultaPlantillaCorreo(Integer bandera,String Idioma,String NombrePlantilla,
            Integer IdTipoPlantilla, Integer MomentoEnvio,String Asunto,
            String EmailRemite,Integer Estado,String Descripcion, Integer IdPlantilla, Integer IdModuloEstado);
    
    public String InsertarPlantillaCorreo(CPlantillaCorreoEntity entidad, Integer bandera,String Idioma,Integer IdUsuarioC);
    
    public String ActualizarPlantillaCorreo(CPlantillaCorreoEntity entidad, Integer bandera,String Idioma,Integer IdUsuarioC);
    
}
