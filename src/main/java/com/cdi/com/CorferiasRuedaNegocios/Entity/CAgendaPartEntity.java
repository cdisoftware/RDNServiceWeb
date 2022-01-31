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
            name = "paCAgendaPart",
            procedureName = "paCAgendaPart",
            resultClasses = CAgendaPartEntity.class)
})
public class CAgendaPartEntity {

    @Id
    @JsonProperty("IdAgenda")
    private Integer IdAgenda;

    @JsonProperty("Aprueba")
    private String Aprueba;

    @JsonProperty("EmpresaAprueba")
    private String EmpresaAprueba;
    
    @JsonProperty("FechaAgenda")
    private String FechaAgenda;
}
