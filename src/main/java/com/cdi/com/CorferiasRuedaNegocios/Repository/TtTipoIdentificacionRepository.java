
package com.cdi.com.CorferiasRuedaNegocios.Repository;

import com.cdi.com.CorferiasRuedaNegocios.Entity.TtTipoIdentificacionEntity;
import java.util.List;
import org.springframework.data.repository.Repository;


public interface TtTipoIdentificacionRepository extends Repository<TtTipoIdentificacionEntity,Integer> {
    
        public List<TtTipoIdentificacionEntity> findAll();

}
