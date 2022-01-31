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
            name = "paPRespuestaPreguntasSegEn",
            procedureName = "paPRespuestaPreguntasSegEn",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class PRespuestaPreguntasSegEnEntity {

    @Id
    @JsonProperty("IdPregunta")
    private Integer IdPregunta;
    
    @JsonProperty("IdEvaluacion")
    private Integer IdEvaluacion;
    
    @JsonProperty("IdParticipante")
    private Integer IdParticipante;
    
    @JsonProperty("IdUsuarioC")
    private String IdUsuarioC;
    
    @JsonProperty("FechaRegistro")
    private String FechaRegistro;
    
    @JsonProperty("Respuesta")
    private String Respuesta;
    
    @JsonProperty("IdContacto")
    private Integer IdContacto;

}
