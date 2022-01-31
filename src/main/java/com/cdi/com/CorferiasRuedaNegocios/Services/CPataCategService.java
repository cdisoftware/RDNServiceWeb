package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CPataCategEntity;
import java.util.List;

public interface CPataCategService {

    public List<CPataCategEntity> ConsultaPataCateg(String Idioma, Integer idusuario,
            Integer IdRdn, Integer IdCategoriaPata, Integer bandera);

}
