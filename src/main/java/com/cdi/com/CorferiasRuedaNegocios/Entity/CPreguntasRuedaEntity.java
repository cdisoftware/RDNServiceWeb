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
            name = "paCPreguntasRueda",
            procedureName = "paCPreguntasRueda",
            resultClasses = CPreguntasRuedaEntity.class)
})
public class CPreguntasRuedaEntity {

    @Id
    @JsonProperty("IdPregunta")
    private Integer IdPregunta;

    @JsonProperty("IdRuedaNegocio")
    private Integer IdRuedaNegocio;

    @JsonProperty("IdPerfilRueda")
    private Integer IdPerfilRueda;

    @JsonProperty("IdTipoPregunta")
    private Integer IdTipoPregunta;

    @JsonProperty("Descripcion")
    private String Descripcion;

    @JsonProperty("Pregunta")
    private String Pregunta;

    @JsonProperty("Respuesta")
    private String Respuesta;

    @JsonProperty("Estado")
    private Integer Estado;

    @JsonProperty("Internacional")
    private Integer Internacional;

    @JsonProperty("Nacional")
    private Integer Nacional;

    @JsonProperty("IdListaRespuesta")
    private Integer IdListaRespuesta;

}
