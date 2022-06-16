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
            name = "mv_listaSectoresConOfertas",
            procedureName = "mv_listaSectoresConOfertas",
            resultClasses = mv_listaSectoresConOfertasEntity.class)
})
public class mv_listaSectoresConOfertasEntity {

    @Id
    @JsonProperty("SCTOR_OFRTA")
    public Integer SCTOR_OFRTA;
    
     @JsonProperty("DSCRPCION_SCTOR")
    public String DSCRPCION_SCTOR;

}
