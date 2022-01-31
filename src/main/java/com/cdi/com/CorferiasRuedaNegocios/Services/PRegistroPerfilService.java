package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.PRegistroPerfilEntity;
import java.util.List;

public interface PRegistroPerfilService {

    public List<PRegistroPerfilEntity> ConsultarRegistroPerfil(Integer Bandera, String Idioma, Integer IdRueda);

}
