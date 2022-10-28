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
            name = "paC_MisToppings",
            procedureName = "paC_MisToppings",
            resultClasses = CMisToppingsEntity.class)
})
public class CMisToppingsEntity {

    @Id
    @JsonProperty("Id")
    public Integer Id;

    @JsonProperty("IdCliente")
    public Integer IdCliente;

    @JsonProperty("IdTopping")
    public Integer IdTopping;

    @JsonProperty("DescTopping")
    public String DescTopping;

    @JsonProperty("IdTipoTopping")
    public Integer IdTipoTopping;

    @JsonProperty("DesTipoTopping")
    public String DesTipoTopping;

    @JsonProperty("Cantidad")
    public Integer Cantidad;

    @JsonProperty("ValorUndToppin")
    public String ValorUndToppin;

    @JsonProperty("VlorUndForm")
    public String VlorUndForm;

    @JsonProperty("ValorTotalTopping")
    public String ValorTotalTopping;

    @JsonProperty("VlorTotalForm")
    public String VlorTotalForm;

}
