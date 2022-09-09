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
            name = "paPValidaFechaSala",
            procedureName = "paPValidaFechaSala",
            resultClasses = PValidaFechaSalaEntity.class)
})
public class PValidaFechaSalaEntity {

     @Id
    @JsonProperty("Respuesta")
    public Integer Respuesta;
   
   
}
