
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CRelDocEnvioCorreoModEntity;
import java.util.List;


public interface CRelDocEnvioCorreoModService {
    
    public List<CRelDocEnvioCorreoModEntity> ConsultaRelacionDocEnvioCorreo(Integer Bandera,
            Integer IdPlantilla,String Documento,Integer Id, String Idioma);
    
    public String InsertarRelacionEnvioCorreoMod(CRelDocEnvioCorreoModEntity entidad, Integer Bandera, String Idioma);

    public String EliminarRelacionEnvioCorreoMod(CRelDocEnvioCorreoModEntity entidad, Integer Bandera, String Idioma);
}
