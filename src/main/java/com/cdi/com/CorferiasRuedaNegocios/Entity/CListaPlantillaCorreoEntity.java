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
            name = "paCListaPlantillaCorreo",
            procedureName = "paCListaPlantillaCorreo",
            resultClasses = CListaPlantillaCorreoEntity.class)
})
public class CListaPlantillaCorreoEntity {

    @Id
    @JsonProperty("idioma")
    private Integer idioma;
    
    @JsonProperty("IdPlantilla")
    private Integer IdPlantilla;

    @JsonProperty("NombrePlantilla")
    private String NombrePlantilla;
}
