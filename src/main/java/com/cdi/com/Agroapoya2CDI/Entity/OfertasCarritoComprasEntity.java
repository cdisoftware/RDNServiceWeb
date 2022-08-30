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
            name = "paC_OfertasCarritoCompras",
            procedureName = "paC_OfertasCarritoCompras",
            resultClasses = OfertasCarritoComprasEntity.class)
})
public class OfertasCarritoComprasEntity {

    @Id
    @JsonProperty("id")
    public Integer id;

    @JsonProperty("cd_cnsctvo")
    public Integer cd_cnsctvo;

    @JsonProperty("cd_prdcto")
    public Integer cd_prdcto;

    @JsonProperty("NombreCompletoProductor")
    public String NombreCompletoProductor;

    @JsonProperty("usuCodig")
    public Integer usuCodig;

    @JsonProperty("Producto")
    public String Producto;

    @JsonProperty("DescripcionProducto")
    public String DescripcionProducto;

    @JsonProperty("cd_cndcion")
    public Integer cd_cndcion;

    @JsonProperty("CondicionEntrega")
    public String CondicionEntrega;

    @JsonProperty("cd_tmno")
    public Integer cd_tmno;

    @JsonProperty("Tamano")
    public String Tamano;

    @JsonProperty("ID_EMPAQUE")
    public Integer ID_EMPAQUE;

    @JsonProperty("Empaque")
    public String Empaque;

    @JsonProperty("pesoTablaProductor")
    public String pesoTablaProductor;

    @JsonProperty("pesoTablaEmpaque")
    public String pesoTablaEmpaque;

    @JsonProperty("unidadesOfertadas")
    public Integer unidadesOfertadas;

    @JsonProperty("VrUnidadEmpaque")
    public String VrUnidadEmpaque;

    @JsonProperty("VrUnidadEmpForm")
    public String VrUnidadEmpForm;

    @JsonProperty("VrTotalOferta")
    public String VrTotalOferta;

    @JsonProperty("VrTotalOfForm")
    public String VrTotalOfForm;

    @JsonProperty("VigenciaDesde")
    public String VigenciaDesde;

    @JsonProperty("VigenciaHasta")
    public String VigenciaHasta;

    @JsonProperty("IdEstado_Oferta")
    public Integer IdEstado_Oferta;

    @JsonProperty("Desc_estado")
    public String Desc_estado;

    @JsonProperty("UBCCION_PRCLA")
    public String UBCCION_PRCLA;

    @JsonProperty("COORDENADAS_PRCLA")
    public String COORDENADAS_PRCLA;

    @JsonProperty("CD_PAIS")
    public Integer CD_PAIS;

    @JsonProperty("CD_RGION")
    public Integer CD_RGION;

    @JsonProperty("Dep_Orig")
    public String Dep_Orig;

    @JsonProperty("CD_MNCPIO")
    public Integer CD_MNCPIO;

    @JsonProperty("Ciudad_Orig")
    public String Ciudad_Orig;

    @JsonProperty("ImagenOferta")
    public String ImagenOferta;

    @JsonProperty("undTotalesEntregar")
    public Integer undTotalesEntregar;

    @JsonProperty("vlrTotalUnidad")
    public String vlrTotalUnidad;

    @JsonProperty("vlrTotalUnidadForm")
    public String vlrTotalUnidadForm;

    @JsonProperty("vlrTotalsinDomicilio")
    public String vlrTotalsinDomicilio;

    @JsonProperty("vlrTotalconDomicilio")
    public String vlrTotalconDomicilio;

    @JsonProperty("vlrTotalsinDomicilioForm")
    public String vlrTotalsinDomicilioForm;

    @JsonProperty("vlrTotalconDomicilioForm")
    public String vlrTotalconDomicilioForm;

    @JsonProperty("codDescuento")
    public String codDescuento;

    @JsonProperty("idTipoCompra")
    public Integer idTipoCompra;

    @JsonProperty("idDescTipoCompra")
    public String idDescTipoCompra;

    @JsonProperty("idTipoUsuCompra")
    public Integer idTipoUsuCompra;

    @JsonProperty("idDescTipoUsuCompra")
    public String idDescTipoUsuCompra;

    @JsonProperty("dscripLabel")
    public String dscripLabel;

}
