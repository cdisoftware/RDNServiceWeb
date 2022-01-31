package com.cdi.com.CorferiasRuedaNegocios.Repository;

import com.cdi.com.CorferiasRuedaNegocios.Entity.TtIdiomaEntity;
import java.util.List;
import org.springframework.data.repository.Repository;

public interface TtIdiomaRepository extends Repository<TtIdiomaEntity, Integer> {

    public List<TtIdiomaEntity> findAll();

}
