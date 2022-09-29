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
    public Integer IdParticipante;

    @Id
    @JsonProperty("IdContacto")
    public Integer IdContacto;

    @JsonProperty("NombreCompleto")
    public String NombreCompleto;

    @JsonProperty("Email")
    public String Email;

    @JsonProperty("Telefono")
    public Integer Telefono;

    @JsonProperty("Dependencia")
    public String Dependencia;

    @JsonProperty("Cargo")
    public String Cargo;

    @JsonProperty("EmailOpc")
    public String EmailOpc;

}
