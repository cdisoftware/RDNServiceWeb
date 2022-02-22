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
    public String Consec;

    @JsonProperty("IdSector")
    public Integer IdSector;

    @JsonProperty("IdCategoria")
    public Integer IdCategoria;

    @JsonProperty("IdSubcategoria")
    public Integer IdSubcategoria;

    @JsonProperty("Estado")
    public Integer Estado;

    @JsonProperty("IdParticipante")
    public Integer IdParticipante;

    @JsonProperty("NombreSector")
    public String NombreSector;

    @JsonProperty("NombreCategoria")
    public String NombreCategoria;

    @JsonProperty("NombreSubcategoria")
    public String NombreSubcategoria;
}
