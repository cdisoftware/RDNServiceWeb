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
            name = "paPRdnParticipante",
            procedureName = "paPRdnParticipante",
            resultClasses = PRdnParticipanteEntity.class)
})
public class PRdnParticipanteEntity {

    @Id
    @JsonProperty("IdRuedaNegocio")
    private Integer IdRuedaNegocio;

    @JsonProperty("Imagen")
    private String Imagen;

    @JsonProperty("NombreRDN")
    private String NombreRDN;

    @JsonProperty("IdContacto")
    private Integer IdContacto;

    @JsonProperty("Estado")
    private String Estado;

    @JsonProperty("DescripcionRDN")
    private String DescripcionRDN;

}
