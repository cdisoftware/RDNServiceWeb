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
            name = "paC_loginTrans",
            procedureName = "paC_loginTrans",
            resultClasses = loginTransEntity.class)
})
public class loginTransEntity {

    @Id
    @JsonProperty("USUCODIG")
    public Integer USUCODIG;

    @JsonProperty("NombrePersona")
    public String NombrePersona;

    @JsonProperty("ApellidoPersona")
    public String ApellidoPersona;

    @JsonProperty("Celular")
    public String Celular;

    @JsonProperty("CorreoPersona")
    public String CorreoPersona;

    @JsonProperty("direccionPersona")
    public String direccionPersona;

    @JsonProperty("Token")
    public String Token;

    @JsonProperty("cordenadas")
    public String cordenadas;

    @JsonProperty("tipoTrans")
    public Integer tipoTrans;
}
