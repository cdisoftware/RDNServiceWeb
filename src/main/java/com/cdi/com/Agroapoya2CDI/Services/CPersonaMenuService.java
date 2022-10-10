package com.cdi.com.Agroapoya2CDI.Services;

import com.cdi.com.Agroapoya2CDI.Entity.CPersonaMenuEntity;
import java.util.List;

public interface CPersonaMenuService {

    public List<CPersonaMenuEntity> ConsultaCPersonaMenu(Integer Bandera, Integer Usucodig);
}
