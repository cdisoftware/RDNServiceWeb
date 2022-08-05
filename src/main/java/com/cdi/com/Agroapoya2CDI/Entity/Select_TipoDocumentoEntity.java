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
            name = "paT_TipoDocumento",
            procedureName = "paT_TipoDocumento",
            resultClasses = Select_TipoDocumentoEntity.class)
})
public class Select_TipoDocumentoEntity {

    @Id
    @JsonProperty("CD_TIPO_ID")
    public Integer CD_TIPO_ID;

    @JsonProperty("NMBRE_ID")
    public String NMBRE_ID;

    @JsonProperty("SIGLA")
    public String SIGLA;

    @JsonProperty("TPO_ID_ATT")
    public Integer TPO_ID_ATT;

    @JsonProperty("CD_ESTDO")
    public Integer CD_ESTDO;
}
