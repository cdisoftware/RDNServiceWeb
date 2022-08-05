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
            name = "paC_ValidaCodigo",
            procedureName = "paC_ValidaCodigo",
            resultClasses = MV_AGRO_VALIDACODIGOEntity.class)
})
public class MV_AGRO_VALIDACODIGOEntity {

    @Id
    @JsonProperty("IdTipoCompra")
    public Integer IdTipoCompra;

    @JsonProperty("compraDescrip")
    public String compraDescrip;

    @JsonProperty("valorsinformatotal")
    public String valorsinformatotal;

    @JsonProperty("valorConFormato")
    public String valorConFormato;

    @JsonProperty("valorUnidad")
    public String valorUnidad;

    @JsonProperty("valorUnidadForm")
    public String valorUnidadForm;

}
