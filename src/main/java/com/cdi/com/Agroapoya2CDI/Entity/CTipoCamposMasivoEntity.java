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
            name = "paC_TipoCamposMasivo",
            procedureName = "paC_TipoCamposMasivo",
            resultClasses = CTipoCamposMasivoEntity.class)
})
public class CTipoCamposMasivoEntity {

    @Id
    @JsonProperty("idCampo")
    public Integer idCampo;

    @JsonProperty("Descripcion")
    public String Descripcion;

    @JsonProperty("CodCampo")
    public String CodCampo;
}
