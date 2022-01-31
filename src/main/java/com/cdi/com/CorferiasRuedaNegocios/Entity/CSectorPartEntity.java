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
            name = "paCSectorPart",
            procedureName = "paCSectorPart",
            resultClasses = CSectorPartEntity.class)
})
public class CSectorPartEntity {

    @Id
    @JsonProperty("IdUnico")
    private Integer IdUnico;

    @JsonProperty("IdSector")
    private Integer IdSector;

    @JsonProperty("NombreSector")
    private String NombreSector;

    @JsonProperty("Estado")
    private Integer Estado;

    @JsonProperty("IdRuedaNegocio")
    private Integer IdRuedaNegocio;

    @JsonProperty("IdParticipante")
    private Integer IdParticipante;

    @JsonProperty("NombreEmpresa")
    private String NombreEmpresa;
}
