
package com.cdi.com.CorferiasRuedaNegocios.Repository;

import com.cdi.com.CorferiasRuedaNegocios.Entity.TtTipoEnvioCorreoEntity;
import java.util.List;
import org.springframework.data.repository.Repository;


public interface TtTipoEnvioCorreoRepository extends Repository<TtTipoEnvioCorreoEntity, Integer> {
    
    public List<TtTipoEnvioCorreoEntity> findAll();
}
