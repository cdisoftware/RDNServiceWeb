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
@Table(name = "TtTipoEnvioCorreo")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Data
public class TtTipoEnvioCorreoEntity {

    @Id
    @JsonProperty("IdTipoEnvio")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdTipoEnvio;

    @JsonProperty("Descripcion")
    private String Descripcion;
}
