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
 * @author Pedro p Listado tipos de plantilla
 */
@Entity
@Table(name = "TtTipoPlantilla")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Data
public class TtTipoPlantillaEntity implements Serializable {

    @Id
    @JsonProperty("IdTipoPlantilla")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdTipoPlantilla;

    @JsonProperty("Descripcion")
    private String Descripcion;
}
