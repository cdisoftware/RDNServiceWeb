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
            name = "paPLinkSalaCita",
            procedureName = "paPLinkSalaCita",
            resultClasses = PLinkSalaCitaEntity.class)
})
public class PLinkSalaCitaEntity {

    @Id
    @JsonProperty("idSala")
    public Integer idSala;

    @JsonProperty("linkSala")
    public String linkSala;
}
