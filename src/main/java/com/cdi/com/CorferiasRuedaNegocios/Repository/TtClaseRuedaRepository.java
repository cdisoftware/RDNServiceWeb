package com.cdi.com.CorferiasRuedaNegocios.Repository;

import com.cdi.com.CorferiasRuedaNegocios.Entity.TtClaseRuedaEntity;
import java.util.List;
import org.springframework.data.repository.Repository;

public interface TtClaseRuedaRepository extends Repository<TtClaseRuedaEntity, Integer> {

    public List<TtClaseRuedaEntity> findAll();

}
