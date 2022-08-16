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
            name = "paCConductorSectorOfertaMod",
            procedureName = "paCConductorSectorOfertaMod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class CConductorSectorOfertaModEntity {

    @Id
    @JsonProperty("ID")
    public String ID;

    @JsonProperty("CD_CNSCTVO")
    public String CD_CNSCTVO;

    @JsonProperty("ID_SCTOR_OFRTA")
    public String ID_SCTOR_OFRTA;

    @JsonProperty("ID_CNDCTOR")
    public String ID_CNDCTOR;

    @JsonProperty("USUCODIG_TRANS")
    public String USUCODIG_TRANS;

    @JsonProperty("VLOR_FLTE_PCTDO")
    public String VLOR_FLTE_PCTDO;

}
