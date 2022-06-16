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
            name = "MV_MLTLSTAS_RGSTRO",
            procedureName = "MV_MLTLSTAS_RGSTRO",
            resultClasses = MV_MLTLSTAS_RGSTROEntity.class)
})
public class MV_MLTLSTAS_RGSTROEntity {

    @Id
    @JsonProperty("Id")
    public Integer Id;

    @JsonProperty("b")
    public String b;

    @JsonProperty("c")
    public Integer c;
}
