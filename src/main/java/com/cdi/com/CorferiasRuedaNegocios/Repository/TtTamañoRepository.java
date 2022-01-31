package com.cdi.com.CorferiasRuedaNegocios.Repository;

import com.cdi.com.CorferiasRuedaNegocios.Entity.TtTamañoEntity;
import java.util.List;
import org.springframework.data.repository.Repository;

public interface TtTamañoRepository extends Repository<TtTamañoEntity, Integer> {

    public List<TtTamañoEntity> findAll();

}
