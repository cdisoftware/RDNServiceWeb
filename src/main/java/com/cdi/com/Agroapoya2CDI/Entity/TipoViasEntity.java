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
            name = "paT_TipoVias",
            procedureName = "paT_TipoVias",
            resultClasses = TipoViasEntity.class)
})
public class TipoViasEntity {

    @Id
    @JsonProperty("Id")
    public Integer Id;

    @JsonProperty("descripcion")
    public String descripcion;
}
