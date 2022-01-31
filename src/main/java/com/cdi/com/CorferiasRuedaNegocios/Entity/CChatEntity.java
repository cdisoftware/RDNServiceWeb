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
            name = "paCChat",
            procedureName = "paCChat",
            resultClasses = CChatEntity.class),
    @NamedStoredProcedureQuery(
            name = "paCChatMod",
            procedureName = "paCChatMod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class CChatEntity {

    @Id
    @JsonProperty("IdChat")
    private Integer IdChat;

    @JsonProperty("IdTipoChat")
    private Integer IdTipoChat;

    @JsonProperty("IdRuedaNegocio")
    private Integer IdRuedaNegocio;

    @JsonProperty("Estado")
    private Integer Estado;

    @JsonProperty("FechaActiva")
    private String FechaActiva;

    @JsonProperty("HoraDesde")
    private String HoraDesde;

    @JsonProperty("HoraHasta")
    private String HoraHasta;

    @JsonProperty("Mensaje")
    private String Mensaje;

    @JsonProperty("NombreRueda")
    private String NombreRueda;

    @JsonProperty("IdJornadaActiva")
    private Integer IdJornadaActiva;
}
