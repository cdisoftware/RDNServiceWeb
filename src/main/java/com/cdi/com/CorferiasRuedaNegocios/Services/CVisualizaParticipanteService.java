package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CVisualizaParticipanteEntity;
import java.util.List;

public interface CVisualizaParticipanteService {

    public List ConsultaVisualizaParticipante(Integer Bandera,
            Integer IdRueda, Integer Vigencia, String Participante, Integer IdPais, String Departamento, String Ciudad,
            Integer TipoPerfil, Integer Estado, Integer Sector, Integer Categoria, Integer Subcategoria, String Nit);
}
