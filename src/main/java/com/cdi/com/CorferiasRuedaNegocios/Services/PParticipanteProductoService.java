
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.PParticipanteProductoEntity;
import java.util.List;


public interface PParticipanteProductoService {
    
     public List<PParticipanteProductoEntity>ConsultaParticipanteProducto(Integer Bandera,Integer IdRueda,Integer IdParticipante,String Idioma);
}
