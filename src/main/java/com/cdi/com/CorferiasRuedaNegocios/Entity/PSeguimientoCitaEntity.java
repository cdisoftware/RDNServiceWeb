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
            name = "paPSeguimientoCita",
            procedureName = "paPSeguimientoCita",
            resultClasses = PSeguimientoCitaEntity.class)
})
public class PSeguimientoCitaEntity {

    @Id
    @JsonProperty("IdAgenda")
    public Integer IdAgenda;

    @JsonProperty("Participante")
    public String Participante;

    @JsonProperty("Producto")
    public String Producto;

    @JsonProperty("Interesado")
    public Integer Interesado;

    @JsonProperty("valorSpot")
    public String valorSpot;

    @JsonProperty("Valor3a6meses")
    public String Valor3a6meses;

    @JsonProperty("Valor6a9meses")
    public String Valor6a9meses;

    @JsonProperty("Valor9a12meses")
    public String Valor9a12meses;

}
