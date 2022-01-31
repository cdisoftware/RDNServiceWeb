
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.PopcionesRtaPregunta;
import java.sql.ResultSet;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

public interface PopcionesRtaPreguntaService {
    
    public  String  ConsultaOpcionesRta(Integer Bandera,Integer IdRuedaNegocio,String Idioma,Integer IdParticipante, Integer Origen,Integer IdPregunta);
}
