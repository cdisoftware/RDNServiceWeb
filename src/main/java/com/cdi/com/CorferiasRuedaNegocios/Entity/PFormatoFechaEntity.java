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
            name = "paPFormatoFecha",
            procedureName = "paPFormatoFecha",
            resultClasses = PFormatoFechaEntity.class)
})
public class PFormatoFechaEntity {

    @Id
    @JsonProperty("Fecha")
    public String Fecha;
}
