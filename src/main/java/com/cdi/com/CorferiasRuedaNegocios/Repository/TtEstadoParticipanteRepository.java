
package com.cdi.com.CorferiasRuedaNegocios.Repository;

import com.cdi.com.CorferiasRuedaNegocios.Entity.TtEstadoParticipanteEntity;
import java.util.List;
import org.springframework.data.repository.Repository;


public interface TtEstadoParticipanteRepository extends Repository<TtEstadoParticipanteEntity,Integer> {
 
    public List<TtEstadoParticipanteEntity> findAll();
}
