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
            name = "paCCosteoOfertaMod",
            procedureName = "paCCosteoOfertaMod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class CosteoOfertaModEntity {

    @Id
    @JsonProperty("CD_CNSCTVO")
    public Integer CD_CNSCTVO;
    
    @JsonProperty("CD_TIPO_COSTEO")
    public Integer CD_TIPO_COSTEO;
    
    @JsonProperty("CD_TPO_VLOR")
    public Integer CD_TPO_VLOR;
    
    @JsonProperty("VLOR")
    public String VLOR;
}
