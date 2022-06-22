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
            name = "Agro_Select_AGRO_FORMA_PAGO",
            procedureName = "Agro_Select_AGRO_FORMA_PAGO",
            resultClasses = Agro_Select_AGRO_FORMA_PAGOEntity.class)
})
public class Agro_Select_AGRO_FORMA_PAGOEntity {

    @Id
    @JsonProperty("ID_FRMA_PGO")
    public Integer ID_FRMA_PGO;

    @JsonProperty("DSCRPCION")
    public String DSCRPCION;

    @JsonProperty("CD_ESTDO")
    public Integer CD_ESTDO;
}
