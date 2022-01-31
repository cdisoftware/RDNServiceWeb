
package com.cdi.com.CorferiasRuedaNegocios.Repository;

import com.cdi.com.CorferiasRuedaNegocios.Entity.TtTipoProgramacionEntity;
import java.util.List;
import org.springframework.data.repository.Repository;


public interface TtTipoProgramacionRepository extends Repository<TtTipoProgramacionEntity,Integer>{
    
        public List<TtTipoProgramacionEntity> findAll();

}
