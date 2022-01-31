package com.cdi.com.CorferiasRuedaNegocios.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import lombok.Data;

@Entity
@Data
@NamedStoredProcedureQueries({
    @NamedStoredProcedureQuery(
            name = "paPConsultaContactoChat",
            procedureName = "paPConsultaContactoChat",
            resultClasses = PConsultaContactoChatEntity.class)
})

public class PConsultaContactoChatEntity {

    @Id
    @JsonProperty("IdParticipanteA")
    private Integer IdParticipanteA;

    @JsonProperty("IdContactoA")
    private Integer IdContactoA;

    @JsonProperty("ContactoCita")
    private String ContactoCita;

    @JsonProperty("Imagen")
    private String Imagen;

    @JsonProperty("EstadoS")
    private Integer EstadoS;

    @JsonProperty("EstadoA")
    private Integer EstadoA;

    @JsonProperty("Parametro")
    private Integer Parametro;
}
