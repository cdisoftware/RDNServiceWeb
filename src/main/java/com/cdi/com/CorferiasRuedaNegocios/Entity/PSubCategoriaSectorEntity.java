package com.cdi.com.CorferiasRuedaNegocios.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import lombok.Data;

@Entity
@Data
@NamedStoredProcedureQueries({
    @NamedStoredProcedureQuery(
            name = "paPSubCategoriaSector",
            procedureName = "paPSubCategoriaSector",
            resultClasses = PSubCategoriaSectorEntity.class)

})
public class PSubCategoriaSectorEntity implements Serializable {

    @Id
    @JsonProperty("Consec")
    private Integer Consec;

    @JsonProperty("IdCategoria")
    private Integer IdCategoria;

    @JsonProperty("NombreSubcategoria")
    private String NombreSubcategoria;

    @JsonProperty("Estado")
    private Integer Estado;
}
