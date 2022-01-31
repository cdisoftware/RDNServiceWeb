package com.cdi.com.CorferiasRuedaNegocios.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
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
            name = "paCAdmPreguntaEstandar",
            procedureName = "paCAdmPreguntaEstandar",
            resultClasses = CAdmPreguntaEstandarEntity.class)

})
public class CAdmPreguntaEstandarEntity implements Serializable {

    @Id
    @JsonProperty("IdPreguntaEstandar")
    private Integer IdPreguntaEstandar;

    @JsonProperty("IdTipoPregunta")
    private Integer IdTipoPregunta;

    @JsonProperty("Pregunta")
    private String Pregunta;

    @JsonProperty("Respuesta")
    private String Respuesta;

    @JsonProperty("Estado")
    private Integer Estado;

    @JsonProperty("IdListaRespuesta")
    private Integer IdListaRespuesta;

}
