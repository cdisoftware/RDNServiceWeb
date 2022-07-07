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
            name = "mv_CiudadesActivas",
            procedureName = "mv_CiudadesActivas",
            resultClasses = mv_CiudadesActivasEntity.class)
})
public class mv_CiudadesActivasEntity {

    @Id
    @JsonProperty("CD_RGION")
    public Integer CD_RGION;

    @JsonProperty("DSCRPCION")
    public String DSCRPCION;

    @JsonProperty("CD_MNCPIO")
    public Integer CD_MNCPIO;
}
