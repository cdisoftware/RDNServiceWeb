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
            name = "paCPreguntasContenido",
            procedureName = "paCPreguntasContenido",
            resultClasses = CPreguntasContenidoEntity.class),
    @NamedStoredProcedureQuery(
            name = "paCPreguntaContenidoMod",
            procedureName = "paCPreguntaContenidoMod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class CPreguntasContenidoEntity {

    @Id
    @JsonProperty("IdPreguntaC")
    private Integer IdPreguntaC ;

    @JsonProperty("FechaRegisto")
    private String FechaRegisto;

    @JsonProperty("IdRuedaNegocio")
    private Integer IdRuedaNegocio ;

    @JsonProperty("IdUsuarioC")
    private Integer IdUsuarioC;

    @JsonProperty("PreguntaUno")
    private String PreguntaUno;

    @JsonProperty("RespuestaUno")
    private String RespuestaUno;

    @JsonProperty("PreguntaDos")
    private String PreguntaDos;

    @JsonProperty("RespuestaDos")
    private String RespuestaDos;

    @JsonProperty("PreguntaTres")
    private String PreguntaTres;

    @JsonProperty("RespuestaTres")
    private String RespuestaTres;

    @JsonProperty("PreguntaCuatro")
    private String PreguntaCuatro;

    @JsonProperty("RespuestaCuatro")
    private String RespuestaCuatro;

    @JsonProperty("PreguntaCinco")
    private String PreguntaCinco;

    @JsonProperty("RespuestaCinco")
    private String RespuestaCinco;

    @JsonProperty("PreguntaSeis")
    private String PreguntaSeis;

    @JsonProperty("RespuestaSeis")
    private String RespuestaSeis ;

}
