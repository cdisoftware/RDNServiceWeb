
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CUsuarioRdnModificaEntity;


public interface CUsuarioRdnModificaService {
    
    public String InsertarRelUsuarioRueda(CUsuarioRdnModificaEntity entity,Integer Bandera);
   
    public String EliminarRelUsuarioRueda(CUsuarioRdnModificaEntity entity,Integer Bandera);
}
