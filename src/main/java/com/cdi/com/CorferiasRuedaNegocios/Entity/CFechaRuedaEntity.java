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
            name = "paCFechaRueda",
            procedureName = "paCFechaRueda",
            resultClasses = CFechaRuedaEntity.class)
})
public class CFechaRuedaEntity {

    @Id
    @JsonProperty("IdRuedaNegocio")
    private Integer IdRuedaNegocio;

    @JsonProperty("FechaInicioRdn")
    private String FechaInicioRdn;

    @JsonProperty("FechaFinRdn")
    private String FechaFinRdn;
}
