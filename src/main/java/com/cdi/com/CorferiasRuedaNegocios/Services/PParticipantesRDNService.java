
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.PParticipantesRDNEntity;
import java.util.List;


public interface PParticipantesRDNService {
    
    public List<PParticipantesRDNEntity> ConsultaParticipanteRDN(Integer Bandera,Integer IdRueda,
            Integer IdParticipante, String NombreEmpresa,Integer IdPais,String IdDepartamento,
            String IdCiudad,String Url,Integer IdSector, Integer Sugerido,Integer IdUsuario,
            String Nit, Integer IdCategoria, String NombreProductoClave);
}
