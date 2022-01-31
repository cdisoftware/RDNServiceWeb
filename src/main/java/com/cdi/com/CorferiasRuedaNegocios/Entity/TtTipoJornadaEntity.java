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
 * @author Pedro p Listado tipos de jornada
 */
@Entity
@Table(name = "TtTipoJornada")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Data
public class TtTipoJornadaEntity implements Serializable {

    @Id
    @JsonProperty("IdTipoJornada")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdTipoJornada;

    @JsonProperty("Descripcion")
    private String Descripcion;
}
