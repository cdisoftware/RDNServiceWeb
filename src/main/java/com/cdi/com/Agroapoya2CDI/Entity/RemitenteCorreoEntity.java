
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
            name = "paC_RemitenteCorreo",
            procedureName = "paC_RemitenteCorreo",
            resultClasses = RemitenteCorreoEntity.class)
})
public class RemitenteCorreoEntity {
      @Id
    @JsonProperty("Id")
    public Integer Id;

    @JsonProperty("CorreoRemitente")
    public String CorreoRemitente;

    @JsonProperty("ServicePath")
    public String ServicePath;

    @JsonProperty("Clave")
    public String Clave;
}
