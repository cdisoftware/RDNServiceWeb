package com.cdi.com.CorferiasRuedaNegocios.Repository;

import com.cdi.com.CorferiasRuedaNegocios.Entity.TtListaOfDemEntity;
import java.util.List;
import org.springframework.data.repository.Repository;

public interface TtListaOfDemRepository extends Repository<TtListaOfDemEntity, Integer> {

    public List<TtListaOfDemEntity> findAll();

}
