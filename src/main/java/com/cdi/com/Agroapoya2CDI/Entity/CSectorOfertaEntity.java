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
            name = "paCSectorOferta",
            procedureName = "paCSectorOferta",
            resultClasses = CSectorOfertaEntity.class)
})
public class CSectorOfertaEntity {

    @Id
    @JsonProperty("ID_SCTOR_OFRTA")
    public Integer ID_SCTOR_OFRTA;

    @JsonProperty("CD_CNSCTVO")
    public Integer CD_CNSCTVO;

    @JsonProperty("DSCRPCION_SCTOR")
    public String DSCRPCION_SCTOR;

    @JsonProperty("CNTDAD")
    public Integer CNTDAD;

    @JsonProperty("VLOR_FLTE_SGRDO")
    public String VLOR_FLTE_SGRDO;

    @JsonProperty("LAT_NORTE")
    public String LAT_NORTE;

    @JsonProperty("LONG_NORTE")
    public String LONG_NORTE;

    @JsonProperty("LAT_SUR")
    public String LAT_SUR;

    @JsonProperty("LONG_SUR")
    public String LONG_SUR;

}
