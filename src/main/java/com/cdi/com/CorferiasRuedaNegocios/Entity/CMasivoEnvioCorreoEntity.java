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
            name = "paCEnvioRealCorreo_Consulta",
            procedureName = "paCEnvioRealCorreo_Consulta",
            resultClasses = CMasivoEnvioCorreoEntity.class),
     @NamedStoredProcedureQuery(
            name = "paCEnvioRealCorreo",
            procedureName = "paCEnvioRealCorreo",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = Integer.class)
            })
})
public class CMasivoEnvioCorreoEntity {

    @Id
    @JsonProperty("IdContacto")
    private Integer IdContacto;

    @JsonProperty("IdPlantilla")
    private Integer IdPlantilla;

    @JsonProperty("Asunto")
    private String Asunto;

    @JsonProperty("Email")
    private String Email;

    @JsonProperty("Html")
    private String Html;

    @JsonProperty("ImagenEnc")
    private String ImagenEnc;

    @JsonProperty("ImagenPie")
    private String ImagenPie;

    @JsonProperty("IdCodigoProceso")
    private Integer IdCodigoProceso;
}
