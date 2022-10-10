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
            name = "paC_TipoNoEntrga",
            procedureName = "paC_TipoNoEntrga",
            resultClasses = CTipoNoEntrgaEntity.class)
})
public class CTipoNoEntrgaEntity {

    @Id
    @JsonProperty("Id")
    public Integer Id;

    @JsonProperty("Descripcion")
    public String Descripcion;

    @JsonProperty("Estado")
    public Integer Estado;
}
