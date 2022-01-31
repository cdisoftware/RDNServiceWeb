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
@Table(name = "TtCamposRueda")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Data
public class TtCamposRuedaEntity {

    @Id
    @JsonProperty("IdCampo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdCampo;

    @JsonProperty("Descripcion")
    private String Descripcion;

    @JsonProperty("Estado")
    private Integer Estado;

    @JsonProperty("CodCampo")
    private String CodCampo;

    @JsonProperty("Query")
    private String Query;
}
