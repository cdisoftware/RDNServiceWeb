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
            name = "AGRO_DIRECCION_POPUP",
            procedureName = "AGRO_DIRECCION_POPUP",
            resultClasses = AGRO_DIRECCION_POPUPEntity.class)
})
public class AGRO_DIRECCION_POPUPEntity {

    @Id
    @JsonProperty("Id")
    public Integer Id;

    @JsonProperty("descripcion")
    public String descripcion;
}
