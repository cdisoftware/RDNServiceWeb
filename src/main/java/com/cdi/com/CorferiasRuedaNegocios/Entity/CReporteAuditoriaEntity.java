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
            name = "paCReporteAuditoria",
            procedureName = "paCReporteAuditoria",
            resultClasses = CReporteAuditoriaEntity.class)
})
public class CReporteAuditoriaEntity {

    @Id
    @JsonProperty("ID")
    private Integer ID;

    @JsonProperty("DaNombTabl")
    private String DaNombTabl;

    @JsonProperty("usuCodig")
    private String usuCodig;

    @JsonProperty("LoFechAudi")
    private String LoFechAudi;

    @JsonProperty("LoOper")
    private String LoOper;

    @JsonProperty("LoRegiAudi")
    private String LoRegiAudi;

    @JsonProperty("TIPOREGUPD")
    private String TIPOREGUPD;

    @JsonProperty("LOREGICONV")
    private String LOREGICONV;

    @JsonProperty("tabla")
    private String tabla;

    @JsonProperty("FechaInicio")
    private String FechaInicio;

    @JsonProperty("FechaFin")
    private String FechaFin;

    @JsonProperty("HoraInicio")
    private String HoraInicio;

    @JsonProperty("HoraFin")
    private String HoraFin;

}
