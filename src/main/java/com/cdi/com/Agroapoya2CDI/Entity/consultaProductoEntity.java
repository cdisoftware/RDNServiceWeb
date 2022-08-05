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
            name = "paC_consultaProducto",
            procedureName = "paC_consultaProducto",
            resultClasses = consultaProductoEntity.class)
})
public class consultaProductoEntity {

    @Id
    @JsonProperty("CD_CNSCTVO")
    public Integer CD_CNSCTVO;

    @JsonProperty("Producto")
    public String Producto;

    @JsonProperty("DescripcionProducto")
    public String DescripcionProducto;

    @JsonProperty("VigenciaDesde")
    public String VigenciaDesde;

    @JsonProperty("VigenciaHasta")
    public String VigenciaHasta;

    @JsonProperty("Empaque")
    public String Empaque;

    @JsonProperty("CondicionEntrega")
    public String CondicionEntrega;

    @JsonProperty("tamano")
    public String tamano;

    @JsonProperty("Ciudad_Orig")
    public String Ciudad_Orig;

    @JsonProperty("Dep_Orig")
    public String Dep_Orig;

    @JsonProperty("Ubicacion_Parcela")
    public String Ubicacion_Parcela;

    @JsonProperty("Nombre_Conductor")
    public String Nombre_Conductor;

    @JsonProperty("Fecha_Entrega")
    public String Fecha_Entrega;

    @JsonProperty("domicilio")
    public String domicilio;

    @JsonProperty("ID_TRNSPORTISTA")
    public Integer ID_TRNSPORTISTA;

    @JsonProperty("SCTOR_OFRTA")
    public Integer SCTOR_OFRTA;

    @JsonProperty("Precio_Individual")
    public String Precio_Individual;

    @JsonProperty("PrecioGrupo")
    public String PrecioGrupo;

    @JsonProperty("Precio_Individual_Form")
    public String Precio_Individual_Form;

    @JsonProperty("Cant_Grupos")
    public Integer Cant_Grupos;

    @JsonProperty("VrCompraAbiForm")
    public String VrCompraAbiForm;

    @JsonProperty("VrCompraCerrForm")
    public String VrCompraCerrForm;

    @JsonProperty("Productor")
    public String Productor;

    @JsonProperty("unidadesMin")
    public Integer unidadesMin;

    @JsonProperty("unidadesMax")
    public Integer unidadesMax;
}
