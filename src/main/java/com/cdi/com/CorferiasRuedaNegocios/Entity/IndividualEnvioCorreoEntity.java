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
            name = "paCEnvioRealCorreo_Individual",
            procedureName = "paCEnvioRealCorreo_Individual",
            resultClasses = IndividualEnvioCorreoEntity.class)

})
public class IndividualEnvioCorreoEntity {

    @JsonProperty("IdPlantilla")
    private Integer IdPlantilla;

    @JsonProperty("Asunto")
    private String Asunto;

    @Id
    @JsonProperty("IdContacto")
    private Integer IdContacto;

    @JsonProperty("Email")
    private String Email;

    @JsonProperty("html")
    private String html;

    @JsonProperty("ImagenEnc")
    private String ImagenEnc;

    @JsonProperty("ImagenPie")
    private String ImagenPie;
}
