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
            name = "paC_CorreoMomentoEnvio",
            procedureName = "paC_CorreoMomentoEnvio",
            resultClasses = CorreoMomentoEnvioEntoty.class)
})
public class CorreoMomentoEnvioEntoty {

    @Id
    @JsonProperty("idMomentoEnvio")
    public Integer idMomentoEnvio;

    @JsonProperty("Descripcion")
    public String Descripcion;
}
