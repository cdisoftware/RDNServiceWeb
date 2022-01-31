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
            name = "paPParticipantePregunta",
            procedureName = "paPParticipantePregunta",
            resultClasses = PParticipantePreguntaEntity.class)
})
public class PParticipantePreguntaEntity {


    @JsonProperty("IdRuedaNegocio")
    private Integer IdRuedaNegocio;

    @Id
    @JsonProperty("IdPreguntaEstandar")
    private Integer IdPreguntaEstandar;

    @JsonProperty("Pregunta")
    private String Pregunta;

    @JsonProperty("Respuesta")
    private String Respuesta;

}
