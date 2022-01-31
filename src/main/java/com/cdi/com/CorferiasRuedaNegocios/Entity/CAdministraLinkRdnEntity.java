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
            name = "paCAdministraLinkRdn",
            procedureName = "paCAdministraLinkRdn",
            resultClasses = CAdministraLinkRdnEntity.class)
})
public class CAdministraLinkRdnEntity {

    @Id
    @JsonProperty("Id")
    private Integer Id;

    @JsonProperty("Descripcion")
    private String Descripcion;

    @JsonProperty("Orden")
    private Integer Orden;

    @JsonProperty("Estado")
    private Integer Estado;
    
        @JsonProperty("Path")
    private String Path;
}
