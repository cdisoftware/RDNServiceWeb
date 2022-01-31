package com.cdi.com.CorferiasRuedaNegocios.Repository;

import com.cdi.com.CorferiasRuedaNegocios.Entity.TtTipoChatEntity;
import java.util.List;
import org.springframework.data.repository.Repository;

public interface TtTipoChatRepository extends Repository<TtTipoChatEntity, Integer> {

    public List<TtTipoChatEntity> findAll();
}
