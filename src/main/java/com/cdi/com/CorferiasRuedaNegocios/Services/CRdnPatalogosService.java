package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CRdnPatalogosEntity;
import java.util.List;

public interface CRdnPatalogosService {

    public List<CRdnPatalogosEntity> ConsultaRdnPatalogos(String Idioma, Integer idusuario, Integer IdRdn, Integer IdCategoriaPata, Integer bandera);

    public String InsertarRdnPatalogo(CRdnPatalogosEntity entidad, String Idioma, Integer idusuario, Integer bandera);

    public String ActualizarRdnPatalogo(CRdnPatalogosEntity entidad, String Idioma, Integer idusuario, Integer bandera);

}
