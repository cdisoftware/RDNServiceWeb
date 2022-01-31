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
            name = "paCCategoriaSector",
            procedureName = "paCCategoriaSector",
            resultClasses = CCategoriaSectorEntity.class),
    @NamedStoredProcedureQuery(
            name = "paCCategoriaSectorModifica",
            procedureName = "paCCategoriaSectorModifica",
            parameters = {
                @StoredProcedureParameter(name = "respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class CCategoriaSectorEntity {

    @Id
    @JsonProperty("ID")
    private Integer ID;

    @JsonProperty("IdCategoria")
    private Integer IdCategoria;

    @JsonProperty("NombreCategoria")
    private String NombreCategoria;

    @JsonProperty("Estado")
    private Integer Estado;

    @JsonProperty("Ididioma")
    private Integer Ididioma;

    @JsonProperty("Imagen")
    private String Imagen;

    @JsonProperty("Codigoidioma")
    private String Codigoidioma;

    @JsonProperty("IdSector")
    private Integer IdSector;

    @JsonProperty("NombreSector")
    private String NombreSector;

    @JsonProperty("IdUsuarioC")
    private Integer IdUsuarioC;
}
