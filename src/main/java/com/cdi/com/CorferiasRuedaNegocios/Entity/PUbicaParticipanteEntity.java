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
    @JsonProperty("IdParticipante")
    public Integer IdParticipante;

    @JsonProperty("IdRuedaNegocio")
    public Integer IdRuedaNegocio;

    @JsonProperty("Pabellon")
    public String Pabellon;

    @JsonProperty("Nivel")
    public String Nivel;

    @JsonProperty("Stand")
    public String Stand;
}
