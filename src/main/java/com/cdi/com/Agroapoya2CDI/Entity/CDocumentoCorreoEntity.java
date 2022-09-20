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
            name = "paC_DocumentoCorreo",
            procedureName = "paC_DocumentoCorreo",
            resultClasses = CDocumentoCorreoEntity.class)
})
public class CDocumentoCorreoEntity {

    @Id
    @JsonProperty("id")
    public Integer id;

    @JsonProperty("IdPlantilla")
    public Integer IdPlantilla;

    @JsonProperty("NombreDocumento")
    public String NombreDocumento;

    @JsonProperty("RutaDocumento")
    public String RutaDocumento;

}
