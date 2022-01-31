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
            name = "paCAsignaAgenda",
            procedureName = "paCAsignaAgenda",
            resultClasses = CAsignaAgendaEntity.class)
})
public class CAsignaAgendaEntity {

    @Id
    @JsonProperty("IdHora")
    private Integer IdHora;

    @JsonProperty("a")
    private String a;

    @JsonProperty("Fecha")
    private String Fecha;
}
