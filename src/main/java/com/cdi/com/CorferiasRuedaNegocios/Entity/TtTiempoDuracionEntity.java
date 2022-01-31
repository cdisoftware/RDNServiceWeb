/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdi.com.CorferiasRuedaNegocios.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "TtTiempoDuracion")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Data
public class TtTiempoDuracionEntity {

    @Id
    @JsonProperty("IdTiempoDuracion")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdTiempoDuracion;

    @JsonProperty("TiempoDuracionMinutos")
    private Integer TiempoDuracionMinutos;

}
