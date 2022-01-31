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
            name = "paCListaMomentoEnvio",
            procedureName = "paCListaMomentoEnvio",
            resultClasses = CListaMomentoEnvioEntity.class)
})
public class CListaMomentoEnvioEntity {

    @Id
    @JsonProperty("Id")
    private Integer Id;

    @JsonProperty("Estado")
    private Integer Estado;

    @JsonProperty("Descripcion")
    private String Descripcion;

    @JsonProperty("Modulo")
    private Integer Modulo;

}
