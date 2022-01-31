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
 * @author Pedro p Listado tipos de participante
 */
@Entity
@Table(name = "TtTipoParticipante")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Data
public class TtTipoParticipanteEntity implements Serializable {

    @Id
    @JsonProperty("IdTipoParticipante")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdTipoParticipante;

    @JsonProperty("Descripcion")
    private String Descripcion;

}
