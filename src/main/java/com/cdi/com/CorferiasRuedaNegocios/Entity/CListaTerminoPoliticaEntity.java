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
            name = "paCListaTerminoPolitica",
            procedureName = "paCListaTerminoPolitica",
            resultClasses = CListaTerminoPoliticaEntity.class)
})
public class CListaTerminoPoliticaEntity {

    @Id
    @JsonProperty("Id")
    private Integer Id;

    @JsonProperty("Descripcion")
    private String Descripcion;
}
