
package com.cdi.com.CorferiasRuedaNegocios.Repository;

import com.cdi.com.CorferiasRuedaNegocios.Entity.TtTiempoDuracionEntity;
import java.util.List;
import org.springframework.data.repository.Repository;


public interface TtTiempoDuracionRepository extends Repository<TtTiempoDuracionEntity, Integer> {
    
     public List<TtTiempoDuracionEntity> findAll();
}
