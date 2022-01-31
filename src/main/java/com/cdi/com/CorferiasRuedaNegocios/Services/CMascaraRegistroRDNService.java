
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CMascaraRegistroRDNEntity;
import java.util.List;


public interface CMascaraRegistroRDNService {
 
    public List<CMascaraRegistroRDNEntity>ConsultaMascaraRegistroRDN(Integer Bandera,Integer IdRdn,Integer IdLabel);
    
    public String InsertarMascaraRegistro(CMascaraRegistroRDNEntity entidad, Integer Bandera, Integer IdLabel);
    
    public String ActualizarMascaraRegistro(CMascaraRegistroRDNEntity entidad, Integer Bandera, Integer IdLabel);
    
}
