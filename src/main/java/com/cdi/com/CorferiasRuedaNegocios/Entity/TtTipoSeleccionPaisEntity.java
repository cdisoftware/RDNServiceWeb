/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdi.com.CorferiasRuedaNegocios.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author Pedro p lista tipo seleccion pais
 */
@Entity
@Table(name = "TtTipoSeleccionPais")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Data
public class TtTipoSeleccionPaisEntity implements Serializable {

    @Id
    @JsonProperty("IdTipoSeleccionPais")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdTipoSeleccionPais;

    @JsonProperty("Descripcion")
    private String Descripcion;
}
