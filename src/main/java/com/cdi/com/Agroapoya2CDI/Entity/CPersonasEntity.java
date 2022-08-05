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
            name = "paCPersonas",
            procedureName = "paCPersonas",
            resultClasses = CPersonasEntity.class)
})
public class CPersonasEntity {

    @Id
    @JsonProperty("codigo_persona")
    public Integer codigo_persona;

    @JsonProperty("nombre_persona")
    public String nombre_persona;
}
