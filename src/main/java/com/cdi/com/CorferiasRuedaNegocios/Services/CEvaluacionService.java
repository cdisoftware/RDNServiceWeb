
package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CEvaluacionEntity;
import java.util.List;


public interface CEvaluacionService {
    
    public List<CEvaluacionEntity> ConsultaEvaluacion(Integer Bandera,String Idioma,Integer IdUsuario,Integer IdEvaluacion,
            Integer RuedaNegocio,Integer Estado,String Vigencia,String Nombre,String FechaEvaluacion,
            Integer TipoPerfil,Integer TipoEva);
}
