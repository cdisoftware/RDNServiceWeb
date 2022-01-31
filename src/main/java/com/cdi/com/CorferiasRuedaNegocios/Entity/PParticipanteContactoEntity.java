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
            name = "paPParticipanteContacto",
            procedureName = "paPParticipanteContacto",
            resultClasses = PParticipanteContactoEntity.class)
})
public class PParticipanteContactoEntity {

    
    @JsonProperty("IdParticipante")
    private Integer IdParticipante;

    @Id
    @JsonProperty("IdContacto")
    private Integer IdContacto;

    @JsonProperty("NombreCompleto")
    private String NombreCompleto;

    @JsonProperty("Email")
    private String Email;

    @JsonProperty("Telefono")
    private Integer Telefono;

    @JsonProperty("Dependencia")
    private String Dependencia;

    @JsonProperty("Cargo")
    private String Cargo;

    @JsonProperty("EmailOpc")
    private String EmailOpc;
}
