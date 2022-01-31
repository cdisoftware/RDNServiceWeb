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
            name = "paCJornadaModifica",
            procedureName = "paCJornadaModifica",
            parameters = {
                @StoredProcedureParameter(name = "respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class CJornadaModificaEntity {

    @Id
    @JsonProperty("IdJornada")
    private Integer IdJornada;

    @JsonProperty("IdRuedaNegocio")
    private Integer IdRuedaNegocio;

    @JsonProperty("IdTipoJornada")
    private Integer IdTipoJornada;

    @JsonProperty("IdUsuarioC")
    private Integer IdUsuarioC;

    @JsonProperty("TipoEvento")
    private String TipoEvento;

    @JsonProperty("Estado")
    private Integer Estado;

    @JsonProperty("Fechaactiva")
    private String Fechaactiva;

    @JsonProperty("FechaJornada")
    private String FechaJornada;

    @JsonProperty("HoraDesde")
    private String HoraDesde;

    @JsonProperty("HoraHasta")
    private String HoraHasta;

    @JsonProperty("Duracion")
    private Integer Duracion;

    @JsonProperty("Espacios")
    private Integer Espacios;

    @JsonProperty("CantidadCitas")
    private Integer CantidadCitas;

    @JsonProperty("Observaciones")
    private String Observaciones;

    @JsonProperty("Contexto")
    private String Contexto;

}
