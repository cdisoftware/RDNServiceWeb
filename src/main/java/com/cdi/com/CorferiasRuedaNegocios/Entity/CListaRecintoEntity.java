package com.cdi.com.CorferiasRuedaNegocios.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import lombok.Data;

/**
 *
 * @author Pedro p lista de recintos
 */
@Entity
@Data
@NamedStoredProcedureQueries({
    @NamedStoredProcedureQuery(
            name = "paCListaRecinto",
            procedureName = "paCListaRecinto",
            resultClasses = CListaRecintoEntity.class)
})
public class CListaRecintoEntity implements Serializable {

    @Id
    @JsonProperty("IdRecinto")
    private Integer IdRecinto;

    @JsonProperty("NombreRecinto")
    private String NombreRecinto;
}
