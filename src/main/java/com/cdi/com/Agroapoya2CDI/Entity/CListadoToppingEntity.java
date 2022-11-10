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
            name = "paC_ListadoTopping",
            procedureName = "paC_ListadoTopping",
            resultClasses = CListadoToppingEntity.class)
})
public class CListadoToppingEntity {

    @Id
    @JsonProperty("IdTopping")
    public Integer IdTopping;

    @JsonProperty("MaxCantidad")
    public Integer MaxCantidad;

    @JsonProperty("IdTipoTopping")
    public Integer IdTipoTopping;

    @JsonProperty("ValorUnitario")
    public String ValorUnitario;

    @JsonProperty("Descripcion")
    public String Descripcion;

    @JsonProperty("Estado")
    public Integer Estado;

    @JsonProperty("descTipotopping")
    public String descTipotopping;

    @JsonProperty("CanInicial")
    public String CanInicial;

    @JsonProperty("cantidadReserva")
    public String cantidadReserva;

    @JsonProperty("cant_disponible")
    public String cant_disponible;

    @JsonProperty("imagen")
    public String imagen;

}
