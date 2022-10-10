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
            name = "paC_Compras",
            procedureName = "paC_Compras",
            resultClasses = CComprasEntity.class)
})
public class CComprasEntity {

    @Id
    @JsonProperty("ID_CLNTE")
    public Integer ID_CLNTE;

    @JsonProperty("Cd_cnsctivo")
    public Integer Cd_cnsctivo;

    @JsonProperty("Usucodig")
    public Integer Usucodig;

    @JsonProperty("IdGrupo")
    public Integer IdGrupo;

    @JsonProperty("Imagen")
    public String Imagen;

    @JsonProperty("IdTipoCompra")
    public Integer IdTipoCompra;

    @JsonProperty("DesTipoCompra")
    public String DesTipoCompra;

    @JsonProperty("IdTipoUsuCompra")
    public Integer IdTipoUsuCompra;

    @JsonProperty("DesTipoUsuCompra")
    public String DesTipoUsuCompra;

    @JsonProperty("IdSecor")
    public Integer IdSecor;

    @JsonProperty("DSCRPCION_SCTOR")
    public String DSCRPCION_SCTOR;

    @JsonProperty("Unidades")
    public Integer Unidades;

    @JsonProperty("Observaciones")
    public String Observaciones;

    @JsonProperty("IdEstdoCmpra")
    public Integer IdEstdoCmpra;

    @JsonProperty("DesEstdoCmpra")
    public String DesEstdoCmpra;

    @JsonProperty("ValorPagar")
    public String ValorPagar;

    @JsonProperty("ValorPagarForm")
    public String ValorPagarForm;

    @JsonProperty("fechaCompra")
    public String fechaCompra;

    @JsonProperty("btnComprar")
    public Integer btnComprar;

    @JsonProperty("btnEliminar")
    public Integer btnEliminar;

    @JsonProperty("CodPedido")
    public String CodPedido;

    @JsonProperty("UrlPagos")
    public String UrlPagos;

    @JsonProperty("IdEstdoPgo")
    public Integer IdEstdoPgo;

    @JsonProperty("DesEstdoPgo")
    public String DesEstdoPgo;

    @JsonProperty("VlorPgoEntrnte")
    public String VlorPgoEntrnte;

    @JsonProperty("VlorPgoEntrnteForm")
    public String VlorPgoEntrnteForm;

    @JsonProperty("Producto")
    public String Producto;

    @JsonProperty("Campesino")
    public String Campesino;

    @JsonProperty("Tamano")
    public String Tamano;

    @JsonProperty("CondicionEntrega")
    public String CondicionEntrega;

    @JsonProperty("Empaque")
    public String Empaque;

    @JsonProperty("DescripcionProducto")
    public String DescripcionProducto;

    @JsonProperty("DepOrigen")
    public String DepOrigen;

    @JsonProperty("CiudadOrigen")
    public String CiudadOrigen;

    @JsonProperty("VigenciaDesde")
    public String VigenciaDesde;

    @JsonProperty("VigenciaHasta")
    public String VigenciaHasta;

    @JsonProperty("FechaEntrega")
    public String FechaEntrega;

}
