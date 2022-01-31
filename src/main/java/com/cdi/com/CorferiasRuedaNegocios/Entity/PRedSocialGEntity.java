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
            name = "paPRedSocialG",
            procedureName = "paPRedSocialG",
            resultClasses = PRedSocialGEntity.class)

})
public class PRedSocialGEntity implements Serializable {

    @Id
    @JsonProperty("Id")
    private Integer Id;

    @JsonProperty("IdFuncion")
    private Integer IdFuncion;

    @JsonProperty("IdRed")
    private Integer IdRed;

    @JsonProperty("Url")
    private String Url;

    @JsonProperty("Estado")
    private Integer Estado;

    @JsonProperty("Imagen")
    private String Imagen;

}
