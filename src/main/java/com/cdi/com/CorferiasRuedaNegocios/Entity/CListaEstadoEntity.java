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
 * @author Pedro p lista de Estados
 */
@Entity
@Data
@NamedStoredProcedureQueries({
    @NamedStoredProcedureQuery(
            name = "paCListaEstado",
            procedureName = "paCListaEstado",
            resultClasses = CListaEstadoEntity.class)
})
public class CListaEstadoEntity implements Serializable {

    @Id
    @JsonProperty("Codigo")
    private Integer Codigo;

    @JsonProperty("Descripcion")
    private String Descripcion;

}
