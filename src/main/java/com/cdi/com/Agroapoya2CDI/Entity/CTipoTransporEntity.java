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
            name = "paC_TipoTranspor",
            procedureName = "paC_TipoTranspor",
            resultClasses = CTipoTransporEntity.class)
})
public class CTipoTransporEntity {

    @Id
    @JsonProperty("Usucodig")
    public Integer Usucodig;

    @JsonProperty("Coordenadas")
    public String Coordenadas;
}
