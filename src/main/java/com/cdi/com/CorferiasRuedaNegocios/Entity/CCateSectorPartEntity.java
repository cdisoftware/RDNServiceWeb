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
            name = "paCCateSectorPart",
            procedureName = "paCCateSectorPart",
            resultClasses = CCateSectorPartEntity.class)
})
public class CCateSectorPartEntity {

    @Id
    @JsonProperty("IdCategoria")
    private Integer IdCategoria;

    @JsonProperty("IdSector")
    private Integer IdSector;

    @JsonProperty("NombreSector")
    private String NombreSector;

    @JsonProperty("NombreCategoria")
    private String NombreCategoria;

    @JsonProperty("IdRuedaNEgocio")
    private Integer IdRuedaNEgocio;

    @JsonProperty("Estado")
    private Integer Estado;

    @JsonProperty("CuentaSubC")
    private Integer CuentaSubC;

}
