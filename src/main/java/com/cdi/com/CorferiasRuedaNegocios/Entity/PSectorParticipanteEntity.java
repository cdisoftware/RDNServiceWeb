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
            name = "paPSectorParticipante",
            procedureName = "paPSectorParticipante",
            resultClasses = PSectorParticipanteEntity.class),
    @NamedStoredProcedureQuery(
            name = "paPSectorParticipanteMod",
            procedureName = "paPSectorParticipanteMod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class PSectorParticipanteEntity implements Serializable {

    @Id
    @JsonProperty("Consec")
    private Integer Consec;

    @JsonProperty("IdSector")
    private Integer IdSector;

    @JsonProperty("IdCategoria")
    private Integer IdCategoria;

    @JsonProperty("IdSubcategoria")
    private Integer IdSubcategoria;

    @JsonProperty("Estado")
    private Integer Estado;

    @JsonProperty("IdParticipante")
    private Integer IdParticipante;

    @JsonProperty("NombreSector")
    private String NombreSector;

    @JsonProperty("NombreCategoria")
    private String NombreCategoria;

    @JsonProperty("NombreSubcategoria")
    private String NombreSubcategoria;
}
