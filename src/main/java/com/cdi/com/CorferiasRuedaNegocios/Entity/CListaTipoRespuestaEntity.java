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
            name = "paCListaTipoRespuesta",
            procedureName = "paCListaTipoRespuesta",
            resultClasses = CListaTipoRespuestaEntity.class)
})
public class CListaTipoRespuestaEntity {

    @Id
    @JsonProperty("IdListaRespuesta")
    private Integer IdListaRespuesta;

    @JsonProperty("Descripcion")
    private String Descripcion;
}
