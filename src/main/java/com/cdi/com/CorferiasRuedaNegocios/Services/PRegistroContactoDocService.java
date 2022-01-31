
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.PRegistroContactoDocEntity;
import java.util.List;

public interface PRegistroContactoDocService {
    
    public List<PRegistroContactoDocEntity> ConsultaPRegistroContactoDoc(Integer Bandera, Integer IdParticipante,
            String NoIdentificacion, String IdIdentificacion, Integer IdRuedaNegocio);
}
