package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.PRecuperaDatosContactoEntity;
import java.util.List;

public interface PRecuperaDatosContactoService {

    public List<PRecuperaDatosContactoEntity> ConsultaRecupDatsContact(PRecuperaDatosContactoEntity entidad, Integer Bandera);
}
