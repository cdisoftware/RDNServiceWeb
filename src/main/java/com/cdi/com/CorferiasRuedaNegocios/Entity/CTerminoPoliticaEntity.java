/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
            name = "paCTerminoPolitica",
            procedureName = "paCTerminoPolitica",
            resultClasses = CTerminoPoliticaEntity.class)
})
public class CTerminoPoliticaEntity {

    @Id
    @JsonProperty("IdTerminoPolitica")
    private Integer IdTerminoPolitica;

    @JsonProperty("Texto")
    private String Texto;

    @JsonProperty("FechaPublicacion")
    private String FechaPublicacion;

    @JsonProperty("Publicar")
    private Integer Publicar;

    @JsonProperty("Documento")
    private String Documento;

    @JsonProperty("Estado")
    private Integer Estado;

    @JsonProperty("TipoDocumento")
    private Integer TipoDocumento;

    @JsonProperty("Obligatorio")
    private Integer Obligatorio;

    @JsonProperty("IdRuedaNegocio")
    private Integer IdRuedaNegocio;

    @JsonProperty("version")
    private Integer version;

    @JsonProperty("FechaRegistro")
    private String FechaRegistro;

    @JsonProperty("IdPerfilRueda")
    private Integer IdPerfilRueda;

    @JsonProperty("Perfil")
    private String Perfil;

}
