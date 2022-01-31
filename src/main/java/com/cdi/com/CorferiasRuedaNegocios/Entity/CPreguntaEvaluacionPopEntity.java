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
            name = "paCPreguntaEvaluacionPop",
            procedureName = "paCPreguntaEvaluacionPop",
            resultClasses = CPreguntaEvaluacionPopEntity.class)
})
public class CPreguntaEvaluacionPopEntity {

    @Id
    @JsonProperty("ID")
    private Integer ID;

    @JsonProperty("IdEvaluacion")
    private Integer IdEvaluacion;

    @JsonProperty("IdPregunta")
    private Integer IdPregunta;

    @JsonProperty("IdTipoPregunta")
    private Integer IdTipoPregunta;

    @JsonProperty("Descripcion")
    private String Descripcion;

    @JsonProperty("pregunta")
    private String pregunta;

    @JsonProperty("Respuesta")
    private String Respuesta;

    @JsonProperty("Orden")
    private Integer Orden;

    @JsonProperty("Estado")
    private Integer Estado;

    @JsonProperty("Ididioma")
    private Integer Ididioma;

    @JsonProperty("Imagen")
    private String Imagen;

    @JsonProperty("Codigoidioma")
    private String Codigoidioma;

    @JsonProperty("IdListaRespuesta")
    private Integer IdListaRespuesta;

}
