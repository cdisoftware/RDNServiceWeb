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
 * @author Pedro p Listado tipo cierre
 */
@Entity
@Table(name = "TtTipoCierre")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Data
public class TtTipoCierreEntity implements Serializable {

    @Id
    @JsonProperty("IdTipoCierre")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdTipoCierre;

    @JsonProperty("Descripcion")
    private String Descripcion;
}
