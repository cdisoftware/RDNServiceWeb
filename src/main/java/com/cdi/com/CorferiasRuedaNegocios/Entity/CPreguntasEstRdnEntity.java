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
import lombok.Data;

@Entity
@Data
@NamedStoredProcedureQueries({
    @NamedStoredProcedureQuery(
            name = "paCPreguntasEstRdn",
            procedureName = "paCPreguntasEstRdn",
            resultClasses = CPreguntasEstRdnEntity.class)

})
public class CPreguntasEstRdnEntity implements Serializable {

    @Id
    @JsonProperty("IdPreguntaEstandar")
    private Integer IdPreguntaEstandar;

    @JsonProperty("Pregunta")
    private String Pregunta;

    @JsonProperty("Visible")
    private Integer Visible;

    @JsonProperty("Obliga")
    private String Obliga;

    @JsonProperty("VisibleBusqueda")
    private String VisibleBusqueda;

    @JsonProperty("Estado")
    private Integer Estado;

    @JsonProperty("IdPerfilRueda")
    private Integer IdPerfilRueda;

    @JsonProperty("Internacional")
    private Integer Internacional;

    @JsonProperty("Nacional")
    private Integer Nacional;

}
