
package com.cdi.com.CorferiasRuedaNegocios.Repository;

import com.cdi.com.CorferiasRuedaNegocios.Entity.TtTipoCitaEntity;
import java.util.List;
import org.springframework.data.repository.Repository;


public interface TtTipoCitaRepositorio extends Repository<TtTipoCitaEntity, Integer> {
    
    public List<TtTipoCitaEntity> findAll();
}
