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
            name = "paT_select_Mncpio",
            procedureName = "paT_select_Mncpio",
            resultClasses = SELECT_MNCPIOEntity.class)
})
public class SELECT_MNCPIOEntity {

    @Id
    @JsonProperty("CNSCTVO")
    public Integer CNSCTVO;

    @JsonProperty("CD_PAIS")
    public Integer CD_PAIS;

    @JsonProperty("CD_RGION")
    public Integer CD_RGION;

    @JsonProperty("CD_MNCPIO")
    public Integer CD_MNCPIO;

    @JsonProperty("DSCRPCION")
    public String DSCRPCION;

    @JsonProperty("CD_PDRE")
    public Integer CD_PDRE;

    @JsonProperty("CD_PSTAL")
    public Integer CD_PSTAL;

    @JsonProperty("CD_INDCTVO")
    public Integer CD_INDCTVO;

    @JsonProperty("COD_ISO_2")
    public String COD_ISO_2;

    @JsonProperty("COD_ISO_3")
    public String COD_ISO_3;

}
