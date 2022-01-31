/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdi.com.CorferiasRuedaNegocios.Repository;

import com.cdi.com.CorferiasRuedaNegocios.Entity.TtTipoEvaEncEntity;
import java.util.List;
import org.springframework.data.repository.Repository;


public interface TtTipoEvaEncRepository extends Repository<TtTipoEvaEncEntity, Integer> {

    public List<TtTipoEvaEncEntity> findAll();

}
