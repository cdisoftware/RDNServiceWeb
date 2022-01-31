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
            name = "paCTtListaRespuestasMod",
            procedureName = "paCTtListaRespuestasMod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class CTtListaRespuestasModEntity {

    @Id
    @JsonProperty("IdListaRespuesta")
    private Integer IdListaRespuesta;

    @JsonProperty("Descripcion")
    private String Descripcion;

    @JsonProperty("Estado")
    private Integer Estado;

    @JsonProperty("IdIdioma")
    private Integer IdIdioma;
}
