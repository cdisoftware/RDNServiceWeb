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
            name = "PaPInfoContacto",
            procedureName = "PaPInfoContacto",
            resultClasses = PInfoContactoEntity.class)
})
public class PInfoContactoEntity {

    @Id
    @JsonProperty("IdContacto")
    private Integer IdContacto;

    @JsonProperty("NoIdentificacion")
    private String NoIdentificacion;

    @JsonProperty("IdIdentificacion")
    private String IdIdentificacion;

    @JsonProperty("NombreCompleto")
    private String NombreCompleto;

    @JsonProperty("Email")
    private String Email;

    @JsonProperty("Contrasena")
    private String Contrasena;

    @JsonProperty("IdParticipante")
    private Integer IdParticipante;

    @JsonProperty("IdIdioma")
    private Integer IdIdioma;

}
