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
            name = "paT_JornadasOferta",
            procedureName = "paT_JornadasOferta",
            resultClasses = JornadasOfertaEntity.class)
})
public class JornadasOfertaEntity {

    @Id
    @JsonProperty("CD_JRNDA")
    public Integer CD_JRNDA;

    @JsonProperty("DESCRIPCION")
    public String DESCRIPCION;
}
