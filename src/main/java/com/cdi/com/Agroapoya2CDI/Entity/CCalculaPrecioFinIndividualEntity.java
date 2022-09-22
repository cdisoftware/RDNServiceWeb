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
            name = "paCCalculaPrecioFinIndividual",
            procedureName = "paCCalculaPrecioFinIndividual",
            resultClasses = CCalculaPrecioFinIndividualEntity.class)
})
public class CCalculaPrecioFinIndividualEntity {

    @Id
    @JsonProperty("PRECIO_FINAL")
    public String PRECIO_FINAL;

    @JsonProperty("PRECIO_FINAL_F")
    public String PRECIO_FINAL_F;
}
