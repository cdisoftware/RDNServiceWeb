
package com.cdi.com.CorferiasRuedaNegocios.Repository;

import com.cdi.com.CorferiasRuedaNegocios.Entity.TtTipoSeleccionEntity;
import java.util.List;
import org.springframework.data.repository.Repository;


public interface TtTipoSeleccionRepository extends Repository<TtTipoSeleccionEntity, Integer>{
    
    public List<TtTipoSeleccionEntity> findAll();
}
