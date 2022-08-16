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
            name = "paT_Sectores",
            procedureName = "paT_Sectores",
            resultClasses = SectoresEntity.class)
})
public class SectoresEntity {

    @Id
    @JsonProperty("SCTOR_OFRTA")
    public Integer SCTOR_OFRTA;

    @JsonProperty("DSCRPCION_SCTOR")
    public String DSCRPCION_SCTOR;

    @JsonProperty("LAT_NORTE")
    public String LAT_NORTE;

    @JsonProperty("LONG_NORTE")
    public String LONG_NORTE;

    @JsonProperty("LAT_SUR")
    public String LAT_SUR;

    @JsonProperty("LONG_SUR")
    public String LONG_SUR;


}
