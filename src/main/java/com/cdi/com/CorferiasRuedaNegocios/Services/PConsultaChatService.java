package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.PConsultaChatEntity;
import java.util.List;

public interface PConsultaChatService {

    public List<PConsultaChatEntity> ConsultaPChat(Integer Bandera, Integer IdContactoS, Integer IdContactoA);

}
