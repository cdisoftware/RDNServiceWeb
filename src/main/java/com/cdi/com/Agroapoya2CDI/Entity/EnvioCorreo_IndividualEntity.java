package com.cdi.com.Agroapoya2CDI.Entity;

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
            name = "paC_EnvioCorreo_Individual",
            procedureName = "paC_EnvioCorreo_Individual",
            resultClasses = EnvioCorreo_IndividualEntity.class)

})
public class EnvioCorreo_IndividualEntity {

    @Id
    @JsonProperty("Email")
    public String Email;

    @JsonProperty("IdPlantilla")
    public Integer IdPlantilla;

    @JsonProperty("Asunto")
    public String Asunto;

    @JsonProperty("IdContacto")
    public Integer IdContacto;

    @JsonProperty("Html")
    public String Html;

    @JsonProperty("ImagenEnc")
    public String ImagenEnc;

    @JsonProperty("ImagenPie")
    public String ImagenPie;

    @JsonProperty("EmailOpc")
    public String EmailOpc;
}
