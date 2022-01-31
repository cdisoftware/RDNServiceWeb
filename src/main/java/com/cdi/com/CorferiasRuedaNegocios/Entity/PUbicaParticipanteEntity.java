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
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import lombok.Data;

@Entity
@Data
@NamedStoredProcedureQueries({
    @NamedStoredProcedureQuery(
            name = "paPUbicaParticipante",
            procedureName = "paPUbicaParticipante",
            resultClasses = PUbicaParticipanteEntity.class),
    @NamedStoredProcedureQuery(
            name = "paPUbicaParticipanteMod",
            procedureName = "paPUbicaParticipanteMod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class PUbicaParticipanteEntity {

    @Id
    @JsonProperty("IdRuedaNegocio")
    private Integer IdRuedaNegocio;

    @JsonProperty("IdParticipante")
    private Integer IdParticipante;

    @JsonProperty("Pabellon")
    private Integer Pabellon;

    @JsonProperty("Nivel")
    private Integer Nivel;

    @JsonProperty("Stand")
    private Integer Stand;
}
