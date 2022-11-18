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
            name = "paC_loginCliente",
            procedureName = "paC_loginCliente",
            resultClasses = loginClienteEntity.class)
})
public class loginClienteEntity {

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

    @JsonProperty("idTipoPersona")
    public Integer idTipoPersona;

    @JsonProperty("descripTipoPersona")
    public String descripTipoPersona;
    
    @JsonProperty("COD_DPTO")
    public String COD_DPTO;
    
    @JsonProperty("NOM_DPTO")
    public String NOM_DPTO;
    
    @JsonProperty("COD_MUN")
    public String COD_MUN;
    
    @JsonProperty("NOMBRE_MUN")
    public String NOMBRE_MUN;
}
