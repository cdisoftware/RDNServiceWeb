
package com.cdi.com.CorferiasRuedaNegocios.Repository;

import com.cdi.com.CorferiasRuedaNegocios.Entity.TtTipoRuedaEntity;
import java.util.List;
import org.springframework.data.repository.Repository;


public interface TtTipoRuedaRepository extends Repository<TtTipoRuedaEntity, Integer>{
    
    public List<TtTipoRuedaEntity> findAll();
}
