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
    public Integer IdPregunta;

    @JsonProperty("IdRuedaNegocio")
    public Integer IdRuedaNegocio;

    @JsonProperty("IdperfilRueda")
    public Integer IdperfilRueda;

    @JsonProperty("Visible")
    public Integer Visible;

    @JsonProperty("Obliga")
    public Integer Obliga;

    @JsonProperty("VisibleBusqueda")
    public Integer VisibleBusqueda;

    @JsonProperty("Estado")
    public Integer Estado;

    @JsonProperty("IdTipoPregunta")
    public Integer IdTipoPregunta;

    @JsonProperty("Pregunta")
    public String Pregunta;

    @JsonProperty("Respuesta")
    public String Respuesta;

    @JsonProperty("Origen")
    public Integer Origen;

    @JsonProperty("Orden")
    public Integer Orden;

}
