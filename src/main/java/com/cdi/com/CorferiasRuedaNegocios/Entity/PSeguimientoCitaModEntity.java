package com.cdi.com.CorferiasRuedaNegocios.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import lombok.Data;

@Entity
@Data
@NamedStoredProcedureQueries({
    @NamedStoredProcedureQuery(
            name = "paPSeguimientoCitaMod",
            procedureName = "paPSeguimientoCitaMod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class PSeguimientoCitaModEntity {

    @Id
    @JsonProperty("IdAgenda")
    public Integer IdAgenda;

    @JsonProperty("IdRuedaNegocio")
    public Integer IdRuedaNegocio;

    @JsonProperty("Producto")
    public String Producto;

    @JsonProperty("Interesado")
    public Integer Interesado;

    @JsonProperty("valorSpot")
    public Integer valorSpot;

    @JsonProperty("Valor3a6meses")
    public Integer Valor3a6meses;

    @JsonProperty("Valor6a9meses")
    public Integer Valor6a9meses;

    @JsonProperty("Valor9a12meses")
    public Integer Valor9a12meses;

}
