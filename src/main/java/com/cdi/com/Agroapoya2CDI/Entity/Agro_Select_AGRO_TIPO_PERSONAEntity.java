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
            name = "Agro_Select_AGRO_TIPO_PERSONA",
            procedureName = "Agro_Select_AGRO_TIPO_PERSONA",
            resultClasses = Agro_Select_AGRO_TIPO_PERSONAEntity.class)
})
public class Agro_Select_AGRO_TIPO_PERSONAEntity {

    @Id
    @JsonProperty("ID_TPO_PRSNA")
    public Integer ID_TPO_PRSNA;

    @JsonProperty("DSCRPCION_TPO")
    public String DSCRPCION_TPO;

    @JsonProperty("CD_ESTDO")
    public Integer CD_ESTDO;
}
