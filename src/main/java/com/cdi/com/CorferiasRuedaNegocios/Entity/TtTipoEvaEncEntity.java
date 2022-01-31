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
@Table(name = "TtTipoEvaEnc")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Data
public class TtTipoEvaEncEntity {

    @Id
    @JsonProperty("IdTipoEvaEnc")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdTipoEvaEnc;

    @JsonProperty("Descripcion")
    private String Descripcion;
}
