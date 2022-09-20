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
            name = "paC_tipoPlantilla",
            procedureName = "paC_tipoPlantilla",
            resultClasses = CtipoPlantillaEntity.class)
})
public class CtipoPlantillaEntity {

    @Id
    @JsonProperty("IdTipoPlantilla")
    public Integer IdTipoPlantilla;

    @JsonProperty("Descripcion")
    public String Descripcion;
}
