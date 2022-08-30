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
            name = "paCEnvioRealCorreo_Consulta",
            procedureName = "paCEnvioRealCorreo_Consulta",
            resultClasses = CEnvioRealCorreo_ConsultaEntity.class)

})
public class CEnvioRealCorreo_ConsultaEntity {

    @Id
    @JsonProperty("Id")
    public Integer Id;

    @JsonProperty("IdPlantilla")
    public Integer IdPlantilla;

    @JsonProperty("Asunto")
    public String Asunto;

    @JsonProperty("usucodig")
    public Integer usucodig;

    @JsonProperty("Email")
    public String Email;

    @JsonProperty("Html")
    public String Html;

    @JsonProperty("ImagenEnc")
    public String ImagenEnc;

    @JsonProperty("ImagenPie")
    public String ImagenPie;

    @JsonProperty("IdCodigoProceso")
    public Integer IdCodigoProceso;
}
