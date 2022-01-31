
package com.cdi.com.CorferiasRuedaNegocios.Repository;

import com.cdi.com.CorferiasRuedaNegocios.Entity.TtGeneroEntity;
import java.util.List;
import org.springframework.data.repository.Repository;


public interface TtGeneroRepository extends Repository<TtGeneroEntity,Integer> {
 
      public List<TtGeneroEntity> findAll();
}
