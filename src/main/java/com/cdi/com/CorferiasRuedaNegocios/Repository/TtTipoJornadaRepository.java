
package com.cdi.com.CorferiasRuedaNegocios.Repository;

import com.cdi.com.CorferiasRuedaNegocios.Entity.TtTipoJornadaEntity;
import java.util.List;
import org.springframework.data.repository.Repository;


public interface TtTipoJornadaRepository extends Repository<TtTipoJornadaEntity, Integer> {
    
    public List<TtTipoJornadaEntity> findAll();
}
