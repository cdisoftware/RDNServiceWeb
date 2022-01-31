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
            name = "paCRelDocEnvioCorreo",
            procedureName = "paCRelDocEnvioCorreo",
            resultClasses = CRelDocEnvioCorreoEntity.class)
})
public class CRelDocEnvioCorreoEntity {

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
