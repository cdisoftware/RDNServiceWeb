package com.cdi.com.Agroapoya2CDI.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import lombok.Data;

@Entity
@Data
@NamedStoredProcedureQueries({
    @NamedStoredProcedureQuery(
            name = "paC_DocumentoCorreoMod",
            procedureName = "paC_DocumentoCorreoMod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class CDocumentoCorreoModEntity {

    @Id
    @JsonProperty("IdPlantilla")
    public Integer IdPlantilla;

    @JsonProperty("IdDocumento")
    public Integer IdDocumento;

    @JsonProperty("NombreDocumento")
    public String NombreDocumento;

    @JsonProperty("rutaDocumento")
    public String rutaDocumento;
}
