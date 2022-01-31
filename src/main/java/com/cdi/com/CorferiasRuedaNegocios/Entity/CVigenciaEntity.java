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
            name = "paCVigencia",
            procedureName = "paCVigencia",
            resultClasses = CVigenciaEntity.class)
})
public class CVigenciaEntity {

    @Id
    @JsonProperty("FechaInicioRdn")
    private String FechaInicioRdn;
}
