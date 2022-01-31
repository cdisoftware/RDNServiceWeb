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
            name = "paCRelDatosContacto",
            procedureName = "paCRelDatosContacto",
            resultClasses = CRelDatosContactoEntity.class)
})
public class CRelDatosContactoEntity {

    
    @JsonProperty("Idparticipante")
    private Integer Idparticipante ;

    @Id
    @JsonProperty("IdContacto")
    private Integer IdContacto;

    @JsonProperty("NombreCompleto")
    private String NombreCompleto ;

    @JsonProperty("IdIdentificacion")
    private Integer IdIdentificacion;

    @JsonProperty("Noidentificacion")
    private String Noidentificacion;

    @JsonProperty("Email")
    private String Email;

    @JsonProperty("IdGenero")
    private Integer IdGenero;

    @JsonProperty("Telefono")
    private String Telefono;

    @JsonProperty("IdIdioma")
    private Integer IdIdioma;

    @JsonProperty("Dependencia")
    private String Dependencia;

    @JsonProperty("Cargo")
    private String Cargo;

    @JsonProperty("EmailOpc")
    private String EmailOpc;

    @JsonProperty("contrasena")
    private String contrasena;

    @JsonProperty("IdPais")
    private Integer IdPais;

    @JsonProperty("Firma")
    private String Firma;

    @JsonProperty("IdDepartamento")
    private String IdDepartamento ;

    @JsonProperty("IdCiudad")
    private String IdCiudad ;

}
