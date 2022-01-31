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
            name = "paPRespPregSegEn",
            procedureName = "paPRespPregSegEn",
            resultClasses = PRespPregSegEnEntity.class)
})
public class PRespPregSegEnEntity {

    @Id
    @JsonProperty("ID")
    private Integer ID;

    @JsonProperty("IdEvaluacion")
    private Integer IdEvaluacion;

    @JsonProperty("IdRuedaNegocio")
    private Integer IdRuedaNegocio;

    @JsonProperty("IdPerfilRueda")
    private Integer IdPerfilRueda;

    @JsonProperty("NombreEvaluacion")
    private String NombreEvaluacion;

    @JsonProperty("IdTipoEvaEnc")
    private Integer IdTipoEvaEnc;

    @JsonProperty("IdPregunta")
    private Integer IdPregunta;

    @JsonProperty("IdTipoPregunta")
    private Integer IdTipoPregunta;

    @JsonProperty("Pregunta")
    private String Pregunta;

    @JsonProperty("OpcionRespuesta")
    private String OpcionRespuesta;

    @JsonProperty("RespuestaContacto")
    private String RespuestaContacto;

    @JsonProperty("IdParticipante")
    private Integer IdParticipante;

    @JsonProperty("IdContacto")
    private Integer IdContacto;

    @JsonProperty("G")
    private Integer G;
}
