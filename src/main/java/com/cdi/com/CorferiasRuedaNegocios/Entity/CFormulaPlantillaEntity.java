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
            name = "paCFormulaPlantilla",
            procedureName = "paCFormulaPlantilla",
            resultClasses = CFormulaPlantillaEntity.class)
})
public class CFormulaPlantillaEntity {

    @Id
    @JsonProperty("IdFormula")
    private Integer IdFormula;

    @JsonProperty("IdPlantilla")
    private Integer IdPlantilla;

    @JsonProperty("Html")
    private String Html;
}
