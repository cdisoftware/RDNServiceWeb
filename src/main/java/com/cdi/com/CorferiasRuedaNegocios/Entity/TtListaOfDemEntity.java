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
 * @author Pedro p Listado TtListaOfDem
 */
@Entity
@Table(name = "TtListaOfDem")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Data
public class TtListaOfDemEntity implements Serializable {

    @Id
    @JsonProperty("IdLista")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdLista;

    @JsonProperty("Descripcion")
    private String Descripcion;
}
