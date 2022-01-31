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
            name = "paPCategoriaSector",
            procedureName = "paPCategoriaSector",
            resultClasses = PCategoriaSectorEntity.class)

})
public class PCategoriaSectorEntity implements Serializable {

    @Id
    @JsonProperty("IdCategoria")
    private Integer IdCategoria;

    @JsonProperty("NombreCategoria")
    private String NombreCategoria;

    @JsonProperty("Estado")
    private Integer Estado;
}
