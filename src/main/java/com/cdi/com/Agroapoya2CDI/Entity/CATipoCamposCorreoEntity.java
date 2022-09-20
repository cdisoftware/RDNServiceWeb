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
            name = "paC_ATipoCamposCorreo",
            procedureName = "paC_ATipoCamposCorreo",
            resultClasses = CATipoCamposCorreoEntity.class)
})
public class CATipoCamposCorreoEntity {

    @Id
    @JsonProperty("idCampo")
    public Integer idCampo;

    @JsonProperty("Descripcion")
    public String Descripcion;

    @JsonProperty("CodCampo")
    public String CodCampo;

    @JsonProperty("Query")
    public String Query;
}
