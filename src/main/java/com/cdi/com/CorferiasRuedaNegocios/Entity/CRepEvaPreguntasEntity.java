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
            name = "paCRepEvaPreguntas",
            procedureName = "paCRepEvaPreguntas",
            resultClasses = CRepEvaPreguntasEntity.class)
})
public class CRepEvaPreguntasEntity {

    @Id
    @JsonProperty("IdPregunta")
    private Integer IdPregunta;

    @JsonProperty("IdEvaluacion")
    private Integer IdEvaluacion;

    @JsonProperty("Orden")
    private Integer Orden;

    @JsonProperty("IdTipoPregunta")
    private Integer IdTipoPregunta;

    @JsonProperty("TIPO")
    private String TIPO;

    @JsonProperty("PREGUNTA")
    private String PREGUNTA;

    @JsonProperty("TipoRespuesta")
    private String TipoRespuesta;

}
