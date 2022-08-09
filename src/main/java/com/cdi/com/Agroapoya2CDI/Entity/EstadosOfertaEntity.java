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
            name = "paT_EstadosOferta",
            procedureName = "paT_EstadosOferta",
            resultClasses = EstadosOfertaEntity.class)
})
public class EstadosOfertaEntity {

    @Id
    @JsonProperty("CD_ESTDO")
    public Integer CD_ESTDO;

    @JsonProperty("DSCRPCION_ESTADO")
    public String DSCRPCION_ESTADO;
}
