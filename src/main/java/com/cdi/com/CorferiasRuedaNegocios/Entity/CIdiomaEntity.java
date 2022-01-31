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
            name = "paCIdioma",
            procedureName = "paCIdioma",
            resultClasses = CIdiomaEntity.class)
})
public class CIdiomaEntity {

    @Id
    @JsonProperty("Id")
    private Integer Id;

    @JsonProperty("IdRdn")
    private Integer IdRdn;

    @JsonProperty("IdIdioma")
    private Integer IdIdioma;

    @JsonProperty("Imagen")
    private String Imagen;

    @JsonProperty("NombreIdioma")
    private String NombreIdioma;

    @JsonProperty("CodigoIdioma")
    private String CodigoIdioma;
}
