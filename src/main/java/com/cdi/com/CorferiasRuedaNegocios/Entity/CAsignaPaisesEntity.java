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
            name = "paCAsignaPaises",
            procedureName = "paCAsignaPaises",
            resultClasses = CAsignaPaisesEntity.class)
})
public class CAsignaPaisesEntity {

    @Id
    @JsonProperty("Consec")
    private Integer Consec;
    
    @JsonProperty("IdAsignaPais")
    private Integer IdAsignaPais ;

    @JsonProperty("IdTipoSeleccionPais")
    private Integer IdTipoSeleccionPais;

    @JsonProperty("TipoSeleccion")
    private String TipoSeleccion ;

    @JsonProperty("TipoParticipante")
    private Integer TipoParticipante;

    @JsonProperty("TipoPerfil")
    private String TipoPerfil;

    @JsonProperty("Nombrepais")
    private String Nombrepais;

    @JsonProperty("IdPais")
    private Integer IdPais;

    @JsonProperty("Estado")
    private Integer Estado;

}
