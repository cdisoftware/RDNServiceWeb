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
 * @author Pedro p Listado clases de Rueda
 */
@Entity
@Table(name = "TtClaseRueda")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Data
public class TtClaseRuedaEntity implements Serializable {

    @Id
    @JsonProperty("IdClaseRueda")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdClaseRueda;

    @JsonProperty("Descripcion")
    private String Descripcion;

    @JsonProperty("Estado")
    private Integer Estado;
}
