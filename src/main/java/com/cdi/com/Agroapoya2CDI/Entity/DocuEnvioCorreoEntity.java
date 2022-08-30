
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
            name = "paC_DocuEnvioCorreo",
            procedureName = "paC_DocuEnvioCorreo",
            resultClasses = DocuEnvioCorreoEntity.class)
})
public class DocuEnvioCorreoEntity {
      @Id
    @JsonProperty("Id")
    public Integer Id;

    @JsonProperty("IdPlantilla")
    public Integer IdPlantilla;

    @JsonProperty("NombreDocumento")
    public String NombreDocumento;

    @JsonProperty("RutaDocumento")
    public String RutaDocumento;
}
