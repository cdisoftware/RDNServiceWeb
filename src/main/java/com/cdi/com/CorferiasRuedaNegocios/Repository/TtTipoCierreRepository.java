package com.cdi.com.CorferiasRuedaNegocios.Repository;

import com.cdi.com.CorferiasRuedaNegocios.Entity.TtTipoCierreEntity;
import java.util.List;
import org.springframework.data.repository.Repository;

public interface TtTipoCierreRepository extends Repository<TtTipoCierreEntity, Integer> {

    public List<TtTipoCierreEntity> findAll();

}
