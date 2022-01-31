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
 * @author Pedro p lista de filtros
 */
@Entity
@Data
@NamedStoredProcedureQueries({
    @NamedStoredProcedureQuery(
            name = "paCListaFiltros",
            procedureName = "paCListaFiltros",
            resultClasses = CListaFiltrosEntity.class)
})
public class CListaFiltrosEntity implements Serializable {

    @Id
    @JsonProperty("ID")
    private String ID;

    @JsonProperty("RESULTADO")
    private String RESULTADO;

}
