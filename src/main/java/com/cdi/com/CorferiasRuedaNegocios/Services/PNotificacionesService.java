package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.PNotificacionesEntity;
import java.util.List;

public interface PNotificacionesService {

    public List<PNotificacionesEntity> ConsultaNotificaciones(Integer Bandera, String Idioma, Integer IdNotificacion, Integer Estado, Integer IdContacto, String Rueda);
}
