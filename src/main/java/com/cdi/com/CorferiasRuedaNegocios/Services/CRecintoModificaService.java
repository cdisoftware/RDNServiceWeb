
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CRecintoModificaEntity;


public interface CRecintoModificaService {
    
    public String InsertarRecinto(CRecintoModificaEntity entidad,Integer bandera,String Idioma,Integer idusuario);
    
    public String ActualizarRecinto(CRecintoModificaEntity entidad,Integer bandera,String Idioma,Integer idusuario);
}
