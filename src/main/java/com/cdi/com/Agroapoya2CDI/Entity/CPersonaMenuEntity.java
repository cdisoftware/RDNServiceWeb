
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
            name = "paC_PersonaMenu",
            procedureName = "paC_PersonaMenu",
            resultClasses = CPersonaMenuEntity.class)
})
public class CPersonaMenuEntity {
     @Id
    @JsonProperty("USUCODIG")
    public Integer USUCODIG;

    @JsonProperty("NOMBRES_PERSONA")
    public String NOMBRES_PERSONA;

    @JsonProperty("APELLIDOS_PERSONA")
    public String APELLIDOS_PERSONA;

    @JsonProperty("CORREO_PERSONA")
    public String CORREO_PERSONA;

    @JsonProperty("CD_DPTO")
    public Integer CD_DPTO;

    @JsonProperty("CD_CDAD")
    public Integer CD_CDAD;

    @JsonProperty("Depto")
    public String Depto;

    @JsonProperty("Ciudad")
    public String Ciudad;

}
