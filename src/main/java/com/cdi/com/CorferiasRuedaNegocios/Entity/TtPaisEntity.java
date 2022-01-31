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
 * @author Pedro p
 * Listado Paises
 */
@Entity
@Table(name = "TtPais")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Data
public class TtPaisEntity implements Serializable {

    @Id
    @JsonProperty("IdPais")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdPais;

    @JsonProperty("NombrePais")
    private String NombrePais;

    @JsonProperty("Codigo")
    private String Codigo;
}
