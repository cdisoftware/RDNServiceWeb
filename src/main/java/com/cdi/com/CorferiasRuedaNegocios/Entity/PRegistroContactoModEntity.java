/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdi.com.CorferiasRuedaNegocios.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
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
            name = "paPRegistroContactoMod",
            procedureName = "paPRegistroContactoMod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class PRegistroContactoModEntity implements Serializable {

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
    private Integer IdIdentificacion;

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

    @JsonProperty("Token")
    private String Token;

    @JsonProperty("Firma")
    private String Firma;

    @JsonProperty("Cargo")
    private String Cargo;

    @JsonProperty("IdUsuarioC")
    private Integer IdUsuarioC;

    @JsonProperty("EmailOpc")
    private String EmailOpc;
}
