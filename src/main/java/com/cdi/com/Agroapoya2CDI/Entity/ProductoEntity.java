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
            name = "paT_Producto",
            procedureName = "paT_Producto",
            resultClasses = ProductoEntity.class)
})
public class ProductoEntity {

    @Id
    @JsonProperty("CD_PRDCTO")
    public Integer CD_PRDCTO;

    @JsonProperty("DSCRPCION")
    public String DSCRPCION;
}
