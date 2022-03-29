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
public class PRegistroContactoModEntity implements Serializable{

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
    public String IdIdentificacion;

    @JsonProperty("NoIdentificacion")
    public String NoIdentificacion;

    @JsonProperty("Telefono")
    public String Telefono;

    @JsonProperty("IdGenero")
    public Integer IdGenero;

    @JsonProperty("IdIdioma")
    public Integer IdIdioma;

    @JsonProperty("Cargo")
    public String Cargo;

    @JsonProperty("Dependencia")
    public String Dependencia;

    @JsonProperty("Contrasena")
    public String Contrasena;

    @JsonProperty("Firma")
    public String Firma;

    @JsonProperty("EmailOpc")
    public String EmailOpc;

    @JsonProperty("FirmaBit")
    public String FirmaBit;
}
