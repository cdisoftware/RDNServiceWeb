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
            name = "pa_ActualizaLink",
            procedureName = "pa_ActualizaLink")
})
public class ActualizaLinkEntity {

    @Id
    @JsonProperty("IdGrupo")
    public Integer IdGrupo;

    @JsonProperty("Link")
    public String Link;
}
