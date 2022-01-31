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
            name = "paCPreguntasEvaluacion",
            procedureName = "paCPreguntasEvaluacion",
            resultClasses = CPreguntasEvaluacionEntity.class)
})
public class CPreguntasEvaluacionEntity {

    @Id
    @JsonProperty("IdPregunta")
    private Integer IdPregunta;

    @JsonProperty("IdEvaluacion")
    private Integer IdEvaluacion;

    @JsonProperty("IdTipoPregunta")
    private Integer IdTipoPregunta;

    @JsonProperty("Descripcion")
    private String Descripcion;

    @JsonProperty("Pregunta")
    private String Pregunta;

    @JsonProperty("Respuesta")
    private String Respuesta;

    @JsonProperty("Orden")
    private Integer Orden;

    @JsonProperty("Estado")
    private Integer Estado;
    
     @JsonProperty("IdListaRespuesta")
    private Integer IdListaRespuesta;
}
