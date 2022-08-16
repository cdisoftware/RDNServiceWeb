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
            name = "paCSectorOfertaMod",
            procedureName = "paCSectorOfertaMod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class CSectorOfertaModEntity {

    @Id
    @JsonProperty("ID")
    public String ID;

    @JsonProperty("CD_CNSCTVO")
    public String CD_CNSCTVO;

    @JsonProperty("ID_SCTOR_OFRTA")
    public String ID_SCTOR_OFRTA;

    @JsonProperty("CNTDAD")
    public String CNTDAD;

    @JsonProperty("VLOR_FLTE_SGRDO")
    public String VLOR_FLTE_SGRDO;
}
