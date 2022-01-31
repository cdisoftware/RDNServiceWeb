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
            name = "paCRelDocPlantillaCorreo",
            procedureName = "paCRelDocPlantillaCorreo",
            resultClasses = CRelDocEnvioCorreoModEntity.class),
    @NamedStoredProcedureQuery(
            name = "paCRelDocEnvioCorreoMod",
            procedureName = "paCRelDocEnvioCorreoMod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class CRelDocEnvioCorreoModEntity {

    @Id
    @JsonProperty("Id")
    private Integer Id;

    @JsonProperty("IdPlantilla")
    private Integer IdPlantilla;

    @JsonProperty("Documento")
    private String Documento;

    @JsonProperty("Path")
    private String Path;
}
