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
            name = "paCEstadoEjecucionCitas",
            procedureName = "paCEstadoEjecucionCitas",
            resultClasses = CEstadoEjecucionCitasEntity.class)
})
public class CEstadoEjecucionCitasEntity {

    @Id
    @JsonProperty("CodigoEstado")
    public Integer CodigoEstado;

    @JsonProperty("DescEstado")
    public String DescEstado;
}
