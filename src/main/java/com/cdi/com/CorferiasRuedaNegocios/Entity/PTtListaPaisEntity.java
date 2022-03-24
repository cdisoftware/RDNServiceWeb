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
            name = "paPTtListaPais",
            procedureName = "paPTtListaPais",
            resultClasses = PTtListaPaisEntity.class)
})
public class PTtListaPaisEntity {

    @Id
    @JsonProperty("IdPais")
    public Integer IdPais;

    @JsonProperty("NombrePais")
    public String NombrePais;

    @JsonProperty("Codigo")
    public String Codigo;
}
