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
            name = "paPRegistroContactoDoc",
            procedureName = "paPRegistroContactoDoc",
            resultClasses = PRegistroContactoDocEntity.class)
})

public class PRegistroContactoDocEntity {

    @Id
    @JsonProperty("IdContacto")
    private Integer IdContacto;

    @JsonProperty("IdParticipante")
    private Integer IdParticipante;

    @JsonProperty("NombreCompleto")
    private String NombreCompleto;

    @JsonProperty("Email")
    private String Email;

    @JsonProperty("IdIdentificacion")
    private String IdIdentificacion;

    @JsonProperty("NoIdentificacion")
    private String NoIdentificacion;

    @JsonProperty("Telefono")
    private String Telefono;

    @JsonProperty("IdGenero")
    private Integer IdGenero;

    @JsonProperty("IdIdioma")
    private Integer IdIdioma;

    @JsonProperty("Dependencia")
    private String Dependencia;

    @JsonProperty("Contrasena")
    private String Contrasena;

    @JsonProperty("Cargo")
    private String Cargo;

    @JsonProperty("Firma")
    private String Firma;

    @JsonProperty("Emailopc")
    private String Emailopc;

    @JsonProperty("AgendaAdicional")
    private Integer AgendaAdicional;

    @JsonProperty("FirmaBit")
    private String FirmaBit;

}
