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
            name = "paCCosteoOferta",
            procedureName = "paCCosteoOferta",
            resultClasses = CosteoOfertaEntity.class)
})
public class CosteoOfertaEntity {

    @Id
    @JsonProperty("ID")
    public Integer ID;

    @JsonProperty("CD_CNSCTVO")
    public Integer CD_CNSCTVO;

    @JsonProperty("CD_TIPO_COSTEO")
    public Integer CD_TIPO_COSTEO;

    @JsonProperty("NOM_TPO_COSTEO")
    public String NOM_TPO_COSTEO;

    @JsonProperty("CD_TPO_VLOR")
    public Integer CD_TPO_VLOR;

    @JsonProperty("NOM_TPO_VLOR")
    public String NOM_TPO_VLOR;

    @JsonProperty("VLOR")
    public String VLOR;
}
