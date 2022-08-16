package com.cdi.com.Agroapoya2CDI.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import lombok.Data;

@Entity
@Data
@NamedStoredProcedureQueries({
    @NamedStoredProcedureQuery(
            name = "paT_SectoresMod",
            procedureName = "paT_SectoresMod",
            parameters = {
                @StoredProcedureParameter(name = "respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class SectoresModEntity {

    @Id
    @JsonProperty("SCTOR_OFR")
    public Integer SCTOR_OFR;

    @JsonProperty("USUCODIG")
    public Integer USUCODIG;

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

    @JsonProperty("CD_RGION")
    public String CD_RGION;

    @JsonProperty("CD_MNCPIO")
    public String CD_MNCPIO;

}
