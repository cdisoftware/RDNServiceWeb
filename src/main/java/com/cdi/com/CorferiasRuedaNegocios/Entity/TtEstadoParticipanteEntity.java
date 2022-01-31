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
 * @author Pedro p  tipos de estado de participante
 */
@Entity
@Table(name = "TtEstadoParticipante")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Data
public class TtEstadoParticipanteEntity implements Serializable {

    @Id
    @JsonProperty("IdEstado")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdEstado;

    @JsonProperty("Descripcion")
    private String Descripcion;
}
