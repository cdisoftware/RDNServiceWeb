package com.cdi.com.Agroapoya2CDI.Entity;

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
            name = "paC_UnidadesDisponibles",
            procedureName = "paC_UnidadesDisponibles",
            resultClasses = CUnidadesDisponiblesEntity.class)
})
public class CUnidadesDisponiblesEntity {

    @Id
    @JsonProperty("UndMinima")
    public Integer UndMinima;

    @JsonProperty("UndMaxima")
    public Integer UndMaxima;
}
