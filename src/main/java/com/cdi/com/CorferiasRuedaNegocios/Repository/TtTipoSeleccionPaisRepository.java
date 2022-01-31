
package com.cdi.com.CorferiasRuedaNegocios.Repository;

import com.cdi.com.CorferiasRuedaNegocios.Entity.TtTipoSeleccionPaisEntity;
import java.util.List;
import org.springframework.data.repository.Repository;


public interface TtTipoSeleccionPaisRepository extends Repository<TtTipoSeleccionPaisEntity, Integer>{
    
     public List<TtTipoSeleccionPaisEntity> findAll();
}
