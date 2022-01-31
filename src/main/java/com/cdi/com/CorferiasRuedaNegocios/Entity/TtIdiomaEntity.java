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
 * @author Pedro p Listado idiomas
 */
@Entity
@Table(name = "TtIdioma")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Data
public class TtIdiomaEntity implements Serializable {

    @Id
    @JsonProperty("IdIdioma")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdIdioma;

    @JsonProperty("NombreIdioma")
    private String NombreIdioma;

    @JsonProperty("Imagen")
    private String Imagen;

    @JsonProperty("CodigoIdioma")
    private String CodigoIdioma;

}
