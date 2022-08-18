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
            name = "paC_estadoEntrega",
            procedureName = "paC_estadoEntrega",
            resultClasses = estadoEntregaEntity.class)
})
public class estadoEntregaEntity {

    @Id
    @JsonProperty("id_entrega")
    public Integer id_entrega;

    @JsonProperty("descripcion")
    public String descripcion;

    @JsonProperty("estado")
    public Integer estado;
}
