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
            name = "paCConductorSectorOferta",
            procedureName = "paCConductorSectorOferta",
            resultClasses = CConductorSectorOfertaEntity.class)
})
public class CConductorSectorOfertaEntity {

    @Id
    @JsonProperty("ID")
    public Integer ID;

      @JsonProperty("CD_CNSCTVO")
    public Integer CD_CNSCTVO;
    
    @JsonProperty("ID_SCTOR_OFRTA")
    public Integer ID_SCTOR_OFRTA;
  

    @JsonProperty("DSCRPCION_SCTOR")
    public String DSCRPCION_SCTOR;

    @JsonProperty("ID_CNDCTOR")
    public Integer ID_CNDCTOR;

    @JsonProperty("USUCODIG_TRANS")
    public Integer USUCODIG_TRANS;

    @JsonProperty("NMBRE_CNDCTOR")
    public String NMBRE_CNDCTOR;

    @JsonProperty("VLOR_FLTE_PCTDO")
    public String VLOR_FLTE_PCTDO;

}
