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
            name = "paCChatMensCons",
            procedureName = "paCChatMensCons",
            resultClasses = CChatMensConsEntity.class)
})

public class CChatMensConsEntity {

    @Id
    @JsonProperty("IdSoporte")
    private Integer IdSoporte;

    @JsonProperty("IdUsuarioC")
    private Integer IdUsuarioC;

    @JsonProperty("IdContactoP")
    private Integer IdContactoP;

    @JsonProperty("Mensaje")
    private String Mensaje;

    @JsonProperty("Fecha")
    private String Fecha;

    @JsonProperty("Contacto")
    private String Contacto;

    @JsonProperty("UsuarioSoporte")
    private String UsuarioSoporte;

    @JsonProperty("IdParticipante")
    private Integer IdParticipante;

    @JsonProperty("Participante")
    private String Participante;

    @JsonProperty("DocParticipante")
    private String DocParticipante;

    @JsonProperty("Estado")
    private Integer Estado;

    @JsonProperty("Imagen")
    private String Imagen;

    @JsonProperty("EstadoC")
    private Integer EstadoC;

}
