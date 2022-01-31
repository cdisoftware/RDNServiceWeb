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

/**
 *
 * @author Pedro p registo participante
 */
@Entity
@Data
@NamedStoredProcedureQueries({
    @NamedStoredProcedureQuery(
            name = "paPRegistroParticipanteMod",
            procedureName = "paPRegistroParticipanteMod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class PRegistroParticipanteModEntity implements Serializable {

    @Id
    @JsonProperty("IdParticipante")
    private Integer IdParticipante;

    @JsonProperty("NombreEmpresa")
    private String NombreEmpresa;

    @JsonProperty("NoIdentificacion")
    private String NoIdentificacion;

    @JsonProperty("IdPais")
    private Integer IdPais;

    @JsonProperty("IdDepartamento")
    private String IdDepartamento;

    @JsonProperty("IdCiudad")
    private String IdCiudad;

    @JsonProperty("Telefono")
    private String Telefono;

    @JsonProperty("Direccion")
    private String Direccion;

    @JsonProperty("Descripcion")
    private String Descripcion;

    @JsonProperty("Url")
    private String Url;

    @JsonProperty("Observacion")
    private String Observacion;

    @JsonProperty("IdUsuarioC")
    private Integer IdUsuarioC;

    @JsonProperty("FechaRegistro")
    private String FechaRegistro;

    @JsonProperty("imagen")
    private String imagen;

}
