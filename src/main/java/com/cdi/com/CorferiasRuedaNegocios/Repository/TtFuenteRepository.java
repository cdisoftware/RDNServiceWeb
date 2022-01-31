package com.cdi.com.CorferiasRuedaNegocios.Repository;

import com.cdi.com.CorferiasRuedaNegocios.Entity.TtFuenteEntity;
import java.util.List;
import org.springframework.data.repository.Repository;

public interface TtFuenteRepository extends Repository<TtFuenteEntity, Integer> {

    public List<TtFuenteEntity> findAll();

}
