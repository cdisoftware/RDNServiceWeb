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
@Table(name = "TtTipoCita")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Data
public class TtTipoCitaEntity {

    @Id
    @JsonProperty("IdTipoCita")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdTipoCita;

    @JsonProperty("Descripcion")
    private String Descripcion;
}
