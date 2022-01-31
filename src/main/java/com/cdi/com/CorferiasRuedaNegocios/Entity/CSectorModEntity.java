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
            name = "paCSectorMod",
            procedureName = "paCSectorMod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class CSectorModEntity {

    @Id
    @JsonProperty("IdSector")
    private Integer IdSector;

    @JsonProperty("NombreSector")
    private String NombreSector;

    @JsonProperty("Estado")
    private Integer Estado;

    @JsonProperty("FechaActiva")
    private String FechaActiva;

    @JsonProperty("IdUsuarioC")
    private Integer IdUsuarioC;

    @JsonProperty("IdRuedaNegocio")
    private Integer IdRuedaNegocio;
}
