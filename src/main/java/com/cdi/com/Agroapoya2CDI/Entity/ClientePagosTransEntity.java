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
            name = "paC_ClientePagosTrans",
            procedureName = "paC_ClientePagosTrans",
            resultClasses = ClientePagosTransEntity.class)
})
public class ClientePagosTransEntity {

    @Id
    @JsonProperty("IdCliente")
    public Integer IdCliente;

    @JsonProperty("Unidades")
    public Integer Unidades;

    @JsonProperty("UsucodigCliente")
    public Integer UsucodigCliente;

    @JsonProperty("ValorPago")
    public String ValorPago;

    @JsonProperty("ValorPagoForm")
    public String ValorPagoForm;

    @JsonProperty("IdGrupo")
    public Integer IdGrupo;

    @JsonProperty("IdEvidencia")
    public Integer IdEvidencia;

    @JsonProperty("ObservacionEntrega")
    public String ObservacionEntrega;

    @JsonProperty("NombreCliente")
    public String NombreCliente;

    @JsonProperty("ApellidoCliente")
    public String ApellidoCliente;

    @JsonProperty("ImagenEvidencia")
    public String ImagenEvidencia;
}
