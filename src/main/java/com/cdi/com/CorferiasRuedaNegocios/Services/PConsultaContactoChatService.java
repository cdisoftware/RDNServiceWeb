package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.PConsultaContactoChatEntity;
import java.util.List;

public interface PConsultaContactoChatService {

    public List<PConsultaContactoChatEntity> ConsultaPContactoChat(Integer Bandera, Integer IdRdn, Integer IdContactoS);
}
