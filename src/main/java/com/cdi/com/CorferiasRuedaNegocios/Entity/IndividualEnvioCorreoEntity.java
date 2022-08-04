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

    @Id
    @JsonProperty("IdContacto")
    public Integer IdContacto;
    
    @JsonProperty("IdPlantilla")
    public Integer IdPlantilla;

    @JsonProperty("Asunto")
    public String Asunto;

    @JsonProperty("Email")
    public String Email;

    @JsonProperty("Html")
    public String Html;

    @JsonProperty("ImagenEnc")
    public String ImagenEnc;

    @JsonProperty("ImagenPie")
    public String ImagenPie;

   // @JsonProperty("EmailOpc")
   // public String EmailOpc;
}
