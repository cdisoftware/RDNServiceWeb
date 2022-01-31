package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CRuedaNegocioEntity;
import java.util.List;

public interface CRuedaNegocioService {

    public List<CRuedaNegocioEntity> ConsultaRuedaNegocios(CRuedaNegocioEntity entidad,
            Integer bandera, String Idioma, Integer Idusuario, Integer TipoPart);
}
