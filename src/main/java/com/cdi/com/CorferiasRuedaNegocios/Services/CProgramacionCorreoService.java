
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CProgramacionCorreoEntity;
import java.util.List;


public interface CProgramacionCorreoService {
    
    public List<CProgramacionCorreoEntity> ConsultaProgramacionCorreo(CProgramacionCorreoEntity entidad,Integer Bandera,
            String Idioma,Integer IdRueda,Integer IdPlantilla,Integer IdPerfil,Integer IdPais,String Departamento,String Ciudad,
            Integer IdEnvio, Integer IdParticipante);
    
    public String InsertarProgramacionCorreo(CProgramacionCorreoEntity entidad, Integer Bandera,String Idioma,Integer IdUsuarioC);
    
    public String ActualizarProgramacionCorreo(CProgramacionCorreoEntity entidad, Integer Bandera,String Idioma,Integer IdUsuarioC);
}
