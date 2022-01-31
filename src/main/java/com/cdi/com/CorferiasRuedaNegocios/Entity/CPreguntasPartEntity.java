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
            name = "paCPreguntasPart",
            procedureName = "paCPreguntasPart",
            resultClasses = CPreguntasPartEntity.class)
})
public class CPreguntasPartEntity {

    @Id
    @JsonProperty("IdPregunta")
    private Integer IdPregunta;

    @JsonProperty("IdRuedaNegocio")
    private Integer IdRuedaNegocio;

    @JsonProperty("Visible")
    private Integer Visible;

    @JsonProperty("Obliga")
    private Integer Obliga;

    @JsonProperty("Pregunta")
    private String Pregunta;

    @JsonProperty("Respuesta")
    private String Respuesta;

    @JsonProperty("IdParticipante")
    private Integer IdParticipante;

    @JsonProperty("Estado")
    private Integer Estado;

    @JsonProperty("consec")
    private Integer consec;

    @JsonProperty("IdTipoPregunta")
    private Integer IdTipoPregunta;

    @JsonProperty("TipoPregunta")
    private String TipoPregunta;

    @JsonProperty("ResPart")
    private String ResPart;

    @JsonProperty("G")
    private Integer G;
}
