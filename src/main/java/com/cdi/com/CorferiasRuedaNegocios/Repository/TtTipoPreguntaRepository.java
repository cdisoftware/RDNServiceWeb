
package com.cdi.com.CorferiasRuedaNegocios.Repository;

import com.cdi.com.CorferiasRuedaNegocios.Entity.TtTipoPreguntaEntity;
import java.util.List;
import org.springframework.data.repository.Repository;


public interface TtTipoPreguntaRepository extends Repository<TtTipoPreguntaEntity, Integer>{
    
    public List<TtTipoPreguntaEntity> findAll();
}
