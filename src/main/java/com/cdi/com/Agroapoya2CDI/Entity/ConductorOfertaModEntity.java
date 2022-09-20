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
            name = "paConductorOfertaMod",
            procedureName = "paConductorOfertaMod",
            parameters = {
                @StoredProcedureParameter(name = "respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class ConductorOfertaModEntity {

    @Id
    @JsonProperty("CD_CNSCTVO")
    public Integer CD_CNSCTVO;

    @JsonProperty("ID_SCTOR_OFRTA")
    public Integer ID_SCTOR_OFRTA;

    @JsonProperty("ID_CNDCTOR")
    public Integer ID_CNDCTOR;

    @JsonProperty("USUCODIG_TRANS")
    public Integer USUCODIG_TRANS;

    @JsonProperty("VLOR_FLTE_PCTDO")
    public String VLOR_FLTE_PCTDO;

    @JsonProperty("ESTADO")
    public Integer ESTADO;
}
