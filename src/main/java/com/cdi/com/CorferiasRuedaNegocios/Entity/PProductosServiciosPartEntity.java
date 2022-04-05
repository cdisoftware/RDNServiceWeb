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
            name = "paPProductosServiciosPart",
            procedureName = "paPProductosServiciosPart",
            resultClasses = PProductosServiciosPartEntity.class)
})
public class PProductosServiciosPartEntity {

    @Id
    @JsonProperty("IdProducto")
    public Integer IdProducto;

    @JsonProperty("Idparticipante")
    public Integer Idparticipante;

    @JsonProperty("PalabraClaveProd")
    public String PalabraClaveProd;

    @JsonProperty("ValidaBuscOfre")
    public Integer ValidaBuscOfre;

    @JsonProperty("BuscaOfrece")
    public String BuscaOfrece;
}
