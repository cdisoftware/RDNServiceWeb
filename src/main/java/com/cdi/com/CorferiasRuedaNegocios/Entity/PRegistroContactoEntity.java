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
            name = "paPRegistroContacto",
            procedureName = "paPRegistroContacto",
            resultClasses = PRegistroContactoEntity.class)
})
public class PRegistroContactoEntity {

    @Id
    @JsonProperty("IdContacto")
    public Integer IdContacto;

    @JsonProperty("IdParticipante")
    public Integer IdParticipante;

    @JsonProperty("NombreCompleto")
    public String NombreCompleto;

    @JsonProperty("Email")
    public String Email;

    @JsonProperty("IdIdentificacion")
    public Integer IdIdentificacion;

    @JsonProperty("NoIdentificacion")
    public String NoIdentificacion;

    @JsonProperty("Telefono")
    public String Telefono;

    @JsonProperty("IdGenero")
    public Integer IdGenero;

    @JsonProperty("IdIdioma")
    public Integer IdIdioma;

    @JsonProperty("Dependencia")
    public String Dependencia;

    @JsonProperty("Contrasena")
    public String Contrasena;

    @JsonProperty("Cargo")
    public String Cargo;

    @JsonProperty("Firma")
    public String Firma;

    @JsonProperty("Emailopc")
    public String Emailopc;

}
