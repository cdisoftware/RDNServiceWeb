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
            name = "paCChatMensMod",
            procedureName = "paCChatMensMod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})

public class CChatMensModEntity {

    @Id
    @JsonProperty("IdSoporte")
    private Integer IdSoporte;

    @JsonProperty("IdUsuarioC")
    private Integer IdUsuarioC;

    @JsonProperty("IdContactoP")
    private Integer IdContactoP;

    @JsonProperty("Mensaje")
    private String Mensaje;

    @JsonProperty("Estado")
    private Integer Estado;

    @JsonProperty("EstadoC")
    private Integer EstadoC;

}
