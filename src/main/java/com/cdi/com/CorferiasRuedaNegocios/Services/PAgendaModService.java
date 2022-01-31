
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.PAgendaModEntity;


public interface PAgendaModService {
    
    public String InsertarPAgenda(PAgendaModEntity entidad, Integer Bandera, Integer Aprueba);
    
    public String ActualizarPAgenda(PAgendaModEntity entidad, Integer Bandera, Integer Aprueba);
    
}
