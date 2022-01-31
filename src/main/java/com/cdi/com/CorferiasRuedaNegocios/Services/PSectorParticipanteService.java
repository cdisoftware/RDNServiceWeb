
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.PSectorParticipanteEntity;
import java.util.List;


public interface PSectorParticipanteService {
    
    public List<PSectorParticipanteEntity> ConsultaSectorParticipante(Integer Bandera,String Idioma,Integer IdParticipante,Integer IdRueda);
    
    public String InsertarConsultaSectorParticipante(PSectorParticipanteEntity entidad, Integer Bandera, String Idioma);
    
    public String ActualizarConsultaSectorParticipante(PSectorParticipanteEntity entidad, Integer Bandera, String Idioma);
}
