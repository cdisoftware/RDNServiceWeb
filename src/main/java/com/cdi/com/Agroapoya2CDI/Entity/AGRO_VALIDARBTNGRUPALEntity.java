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
            name = "AGRO_VALIDARBTNGRUPAL",
            procedureName = "AGRO_VALIDARBTNGRUPAL",
            resultClasses = AGRO_VALIDARBTNGRUPALEntity.class)
})
public class AGRO_VALIDARBTNGRUPALEntity {

    @Id
    @JsonProperty("respuesta")
    private String respuesta;
}
