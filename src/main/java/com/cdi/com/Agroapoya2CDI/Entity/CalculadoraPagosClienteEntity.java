package com.cdi.com.Agroapoya2CDI.Entity;

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
            name = "paC_CalculadoraPagosCliente",
            procedureName = "paC_CalculadoraPagosCliente",
            resultClasses = CalculadoraPagosClienteEntity.class)
})
public class CalculadoraPagosClienteEntity {

    @Id
    @JsonProperty("RtaValor")
    public String RtaValor;
}
