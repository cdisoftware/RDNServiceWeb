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
            name = "Agro_Select_AGRO_BANCO",
            procedureName = "Agro_Select_AGRO_BANCO",
            resultClasses = Agro_Select_AGRO_BANCOEntity.class)
})
public class Agro_Select_AGRO_BANCOEntity {

    @Id
    @JsonProperty("ID_BNCO")
    public Integer ID_BNCO;

    @JsonProperty("DSCRPCION_BNCO")
    public String DSCRPCION_BNCO;

    @JsonProperty("CD_ESTDO")
    public Integer CD_ESTDO;
}
