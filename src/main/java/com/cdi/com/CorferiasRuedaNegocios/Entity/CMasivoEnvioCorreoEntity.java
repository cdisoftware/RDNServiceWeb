package com.cdi.com.CorferiasRuedaNegocios.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
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
            resultClasses = CMasivoEnvioCorreoEntity.class)

})

public class CMasivoEnvioCorreoEntity {

    @Id
    @JsonProperty("Id")
    public Integer Id;

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

    @JsonProperty("IdCodigoProceso")
    public Integer IdCodigoProceso;
}
