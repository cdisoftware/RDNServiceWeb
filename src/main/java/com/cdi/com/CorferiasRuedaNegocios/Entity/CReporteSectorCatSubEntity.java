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
            name = "paCReporteSectorCatSub",
            procedureName = "paCReporteSectorCatSub",
            resultClasses = CReporteSectorCatSubEntity.class)
})
public class CReporteSectorCatSubEntity {

    @Id
    @JsonProperty("ID")
    private Integer ID;

    @JsonProperty("IdRuedaNegocio")
    private Integer IdRuedaNegocio;

    @JsonProperty("NombreRdn")
    private String NombreRdn;

    @JsonProperty("IdSector")
    private Integer IdSector;

    @JsonProperty("IdCategoria")
    private Integer IdCategoria;

    @JsonProperty("IdSubcategoria")
    private Integer IdSubcategoria;

    @JsonProperty("NombreSector")
    private String NombreSector;

    @JsonProperty("NombreCategoria")
    private String NombreCategoria;

    @JsonProperty("NombreSubCategoria")
    private String NombreSubCategoria;

    @JsonProperty("CuentaParticipante")
    private Integer CuentaParticipante;

    @JsonProperty("ParticipanteSector")
    private String ParticipanteSector;

    @JsonProperty("Perfil")
    private String Perfil;

}
