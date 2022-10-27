package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CTipoConductorEntity;
import java.util.List;

public interface CTipoConductorService {

    public List<CTipoConductorEntity> ConsultaCTipoConductor(Integer Bandera, Integer UsucodigTrans);
}
