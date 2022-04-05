package com.cdi.com.CorferiasRuedaNegocios.Entity;

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
            name = "paCTtListas",
            procedureName = "paCTtListas",
            resultClasses = CTtListasEntity.class)
})
public class CTtListasEntity {

    @Id
    @JsonProperty("IdCampo")
    public Integer IdCampo;

    @JsonProperty("Descripcion")
    public String Descripcion;

    @JsonProperty("Estado")
    public Integer Estado;

    @JsonProperty("CodCampo")
    public String CodCampo;

    @JsonProperty("Query")
    public String Query;

}
