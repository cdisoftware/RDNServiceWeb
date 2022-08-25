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
    public Integer IdContacto;

    @JsonProperty("NoIdentificacion")
    public String NoIdentificacion;

    @JsonProperty("IdIdentificacion")
    public String IdIdentificacion;

    @JsonProperty("NombreCompleto")
    public String NombreCompleto;

    @JsonProperty("Email")
    public String Email;

    @JsonProperty("Contrasena")
    public String Contrasena;

    @JsonProperty("IdParticipante")
    public Integer IdParticipante;

    @JsonProperty("IdIdioma")
    public Integer IdIdioma;

}
