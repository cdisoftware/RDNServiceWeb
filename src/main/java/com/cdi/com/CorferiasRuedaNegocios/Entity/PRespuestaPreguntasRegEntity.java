package com.cdi.com.CorferiasRuedaNegocios.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import lombok.Data;

@Entity
@Data
@NamedStoredProcedureQueries({
    @NamedStoredProcedureQuery(
            name = "paPRespuestaPreguntasReg",
            procedureName = "paPRespuestaPreguntasReg",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class PRespuestaPreguntasRegEntity {

    @JsonProperty("IdRuedaNegocio")
    private Integer IdRuedaNegocio;

    @Id
    @JsonProperty("IdPregunta")
    private Integer IdPregunta;

    @JsonProperty("IdParticipante")
    private Integer IdParticipante;

    @JsonProperty("Respuesta")
    private String Respuesta;

    @JsonProperty("Estado")
    private Integer Estado;

    @JsonProperty("IdUsuarioC")
    private Integer IdUsuarioC;

    @JsonProperty("Origen")
    private Integer Origen;
}
