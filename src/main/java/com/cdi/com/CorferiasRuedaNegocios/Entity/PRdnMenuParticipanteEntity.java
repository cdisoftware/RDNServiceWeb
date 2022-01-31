package com.cdi.com.CorferiasRuedaNegocios.Entity;

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
            name = "paPRdnMenuParticipante",
            procedureName = "paPRdnMenuParticipante",
            resultClasses = PRdnMenuParticipanteEntity.class)
})
public class PRdnMenuParticipanteEntity {

    @Id
    @JsonProperty("IdOpcion")
    private Integer IdOpcion;

    @JsonProperty("DescripcionOpcion")
    private String DescripcionOpcion;

    @JsonProperty("Path")
    private String Path;
}
