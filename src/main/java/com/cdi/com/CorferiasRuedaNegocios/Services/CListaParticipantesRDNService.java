package com.cdi.com.CorferiasRuedaNegocios.Services;

import com.cdi.com.CorferiasRuedaNegocios.Entity.CListaParticipantesRDNEntity;
import java.util.List;

public interface CListaParticipantesRDNService {

    public List<CListaParticipantesRDNEntity> ConsultaCListaParticipantesRDN(Integer Bandera, Integer IdRueda, Integer IdParticipante,
            String NombreEmpresa, String Nit, Integer IdPerfil);
}
