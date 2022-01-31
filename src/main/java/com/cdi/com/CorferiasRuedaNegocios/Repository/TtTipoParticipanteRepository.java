package com.cdi.com.CorferiasRuedaNegocios.Repository;

import com.cdi.com.CorferiasRuedaNegocios.Entity.TtTipoParticipanteEntity;
import java.util.List;
import org.springframework.data.repository.Repository;

public interface TtTipoParticipanteRepository extends Repository<TtTipoParticipanteEntity, Integer> {

    public List<TtTipoParticipanteEntity> findAll();
}
