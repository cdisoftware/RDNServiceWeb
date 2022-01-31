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
 * @author Pedro p Listado tipo chat
 */
@Entity
@Table(name = "TtTipoChat")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Data
public class TtTipoChatEntity implements Serializable {

    @Id
    @JsonProperty("IdTipoChat")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdTipoChat;

    @JsonProperty("Descripcion")
    private String Descripcion;

}
