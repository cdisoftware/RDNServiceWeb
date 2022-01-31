
package com.cdi.com.CorferiasRuedaNegocios.Repository;

import com.cdi.com.CorferiasRuedaNegocios.Entity.TtEstadoCitaEntity;
import java.util.List;
import org.springframework.data.repository.Repository;


public interface TtEstadoCitaRepository extends Repository<TtEstadoCitaEntity,Integer> {
   
      public List<TtEstadoCitaEntity> findAll();
}
