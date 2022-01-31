package com.cdi.com.CorferiasRuedaNegocios.Repository;

import com.cdi.com.CorferiasRuedaNegocios.Entity.TtPaisEntity;
import java.util.List;
import org.springframework.data.repository.Repository;

public interface TtPaisRepository extends Repository<TtPaisEntity, Integer> {

    public List<TtPaisEntity> findAll();

}
