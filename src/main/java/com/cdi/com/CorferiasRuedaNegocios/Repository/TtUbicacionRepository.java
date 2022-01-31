
package com.cdi.com.CorferiasRuedaNegocios.Repository;

import com.cdi.com.CorferiasRuedaNegocios.Entity.TtUbicacionEntity;
import java.util.List;
import org.springframework.data.repository.Repository;


public interface TtUbicacionRepository extends Repository<TtUbicacionEntity, Integer> {
    
        public List<TtUbicacionEntity> findAll();

}
