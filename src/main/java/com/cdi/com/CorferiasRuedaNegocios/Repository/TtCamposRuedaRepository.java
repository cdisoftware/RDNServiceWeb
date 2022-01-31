package com.cdi.com.CorferiasRuedaNegocios.Repository;

import com.cdi.com.CorferiasRuedaNegocios.Entity.TtCamposRuedaEntity;
import java.util.List;
import org.springframework.data.repository.Repository;

public interface TtCamposRuedaRepository extends Repository<TtCamposRuedaEntity, Integer> {

    public List<TtCamposRuedaEntity> findAll();
}
