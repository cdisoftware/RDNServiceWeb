package com.cdi.com.CorferiasRuedaNegocios.Repository;

import com.cdi.com.CorferiasRuedaNegocios.Entity.TtTipoPlantillaEntity;
import java.util.List;
import org.springframework.data.repository.Repository;

public interface TtTipoPlantillaRepository extends Repository<TtTipoPlantillaEntity, Integer> {

    public List<TtTipoPlantillaEntity> findAll();

}
