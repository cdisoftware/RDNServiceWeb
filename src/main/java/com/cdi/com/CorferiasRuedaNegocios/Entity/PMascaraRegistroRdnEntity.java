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
            name = "paPMascaraRegistroRdn",
            procedureName = "paPMascaraRegistroRdn",
            resultClasses = PMascaraRegistroRdnEntity.class)
})
public class PMascaraRegistroRdnEntity {

    @Id
    @JsonProperty("Label")
    private String Label;
}
