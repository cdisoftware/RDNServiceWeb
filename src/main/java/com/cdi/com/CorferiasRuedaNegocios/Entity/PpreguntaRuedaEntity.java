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
            name = "paPpreguntaRueda",
            procedureName = "paPpreguntaRueda",
            resultClasses = PpreguntaRuedaEntity.class)
})
public class PpreguntaRuedaEntity {

    @Id
    @JsonProperty("IdPregunta")
    private Integer IdPregunta;

    @JsonProperty("IdRuedaNegocio")
    private Integer IdRuedaNegocio;

    @JsonProperty("IdperfilRueda")
    private Integer IdperfilRueda;

    @JsonProperty("Visible")
    private String Visible;

    @JsonProperty("Obliga")
    private Integer Obliga;

    @JsonProperty("VisibleBusqueda")
    private Integer VisibleBusqueda;

    @JsonProperty("Estado")
    private Integer Estado;

    @JsonProperty("IdTipoPregunta")
    private Integer IdTipoPregunta;

    @JsonProperty("Pregunta")
    private String Pregunta;

    @JsonProperty("Respuesta")
    private String Respuesta;

    @JsonProperty("Origen")
    private Integer Origen;

}
